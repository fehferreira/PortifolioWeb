package br.com.pessoal.portifolio.controller;

import br.com.pessoal.portifolio.controller.dto.DesenvolvedorDto;
import br.com.pessoal.portifolio.repository.DesenvolvedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/desenvolvedores")
public class DesenvolvedorController {

    @Autowired
    private DesenvolvedorRepository desenvolvedorRepository;

    @GetMapping
    public Page<DesenvolvedorDto> listarDesenvolvedores(@PageableDefault(sort="id", direction = Sort.Direction.ASC)Pageable pageable){
        return DesenvolvedorDto.converter(desenvolvedorRepository.findAll(pageable));
    }

}
