package br.com.pessoal.portifolio.controller;

import br.com.pessoal.portifolio.repository.DesenvolvedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/desenvolvedores")
public class DesenvolvedorController {

    @Autowired
    private DesenvolvedorRepository desenvolvedorRepository;

    @GetMapping
    public ResponseEntity<DesenvolvedoreDto> listarDesenvolvedores(){
        return desenvolvedorRepository.findAll();
    }

}
