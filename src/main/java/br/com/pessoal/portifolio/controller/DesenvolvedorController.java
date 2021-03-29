package br.com.pessoal.portifolio.controller;

import br.com.pessoal.portifolio.controller.dto.DesenvolvedorDto;
import br.com.pessoal.portifolio.controller.form.DesenvolvedorAtualizadoForm;
import br.com.pessoal.portifolio.controller.form.DesenvolvedorForm;
import br.com.pessoal.portifolio.model.Desenvolvedor;
import br.com.pessoal.portifolio.repository.DesenvolvedorRepository;
import br.com.pessoal.portifolio.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/desenvolvedores")
public class DesenvolvedorController {

    @Autowired
    private DesenvolvedorRepository desenvolvedorRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    @ResponseBody
    public Page<DesenvolvedorDto> listarDesenvolvedores(@PageableDefault(sort = "id", direction = Sort.Direction.ASC) Pageable pageable) {
        return DesenvolvedorDto.converter(desenvolvedorRepository.findAll(pageable));
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<DesenvolvedorDto> cadastrarDesenvolvedor(@RequestBody DesenvolvedorForm form, UriComponentsBuilder uriBuilder) {
        Desenvolvedor dev = form.converter(usuarioRepository);
        desenvolvedorRepository.save(dev);

        URI uri = uriBuilder.path("/desenvolvedores/{id}").buildAndExpand(dev.getId()).toUri();
        return ResponseEntity.created(uri).body(new DesenvolvedorDto(dev));
    }

    @PutMapping
    @ResponseBody
    public ResponseEntity<DesenvolvedorDto> atualizarDesenvolvedor(@RequestParam DesenvolvedorAtualizadoForm updateForm) {
        Optional<Desenvolvedor> desenvolvedor = desenvolvedorRepository.findById(updateForm.getId());
        if (desenvolvedor.isPresent()) {
            desenvolvedorRepository.save(desenvolvedor.get());
            return ResponseEntity.ok(DesenvolvedorDto.converter(desenvolvedor.get()));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping
    public ResponseEntity<?> deletarDesenvolvedor(@RequestParam Long idDesenvolvedor) {
        try {
            desenvolvedorRepository.deleteById(idDesenvolvedor);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }


    @ResponseBody
    @GetMapping("/{id}")
    public ResponseEntity<DevDetalhadoDto> detalharDesenvolvedor(@RequestParam Long id) {
        Optional<Desenvolvedor> desenvolvedor = desenvolvedorRepository.findById(id);
        if (desenvolvedor.isPresent()) {
            return ResponseEntity.ok().body(DesenvolvedorDto.converter(desenvolvedor.get()));
        }
        return ResponseEntity.notFound().build();
    }

}
