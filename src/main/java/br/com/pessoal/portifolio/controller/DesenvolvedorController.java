package br.com.pessoal.portifolio.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/desenvolvedores")
public class DesenvolvedorController {
    
    @GetMapping
    public ResponseEntity<DesenvolvedoreDto> listarDesenvolvedores(){
        return desenvolvedorRepository.findAll();
    }

}
