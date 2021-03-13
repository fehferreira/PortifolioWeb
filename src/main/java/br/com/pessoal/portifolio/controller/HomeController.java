package br.com.pessoal.portifolio.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ResponseEntity<String> boasVindas(){
        return ResponseEntity.ok("BOAS VINDAS AO SITE DE PORTIFÓLIOS ONLINE");
    }

}
