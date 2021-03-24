package br.com.pessoal.portifolio.controller;


import br.com.pessoal.portifolio.model.Desenvolvedor;
import br.com.pessoal.portifolio.model.Profile;
import br.com.pessoal.portifolio.model.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ResponseEntity<String> boasVindas(){
        return ResponseEntity.ok("BOAS VINDAS AO SITE DE PORTIFÓLIOS ONLINE");
    }

    public void populateSpry(){

        List<Profile> profiles = new ArrayList<>();
        List<Usuario> usuarios = new ArrayList<>();
        List<Desenvolvedor> desenvolvedores = new ArrayList<>();

        profiles.add(new Profile("ADMIN"));
        profiles.add(new Profile("USER"));

        usuarios.add(new Usuario("felipe_ferreira@email.com", "$2y$12$k6ELUSObVYzj..Hc2OaEnOeuj47lto5aAabUkoAH2TNEbMiT6X3u6", profiles.get(1)));
        usuarios.add(new Usuario("mileide_dev@email.com", "$2y$12$ox8SpbwupjeTewN6xg5o/e.JqzJ3aJdBLoGkWJb7eCzi1QecPDgIa", profiles.get(0)));
        usuarios.add(new Usuario("anderson_galdino@email.com", "$2y$12$k1izJKsROxfRwGAt2tHLR.96eAOMtHR5Y4hEQDEJIYx9yKV1jsRD.", profiles.get(1)));


    }

}