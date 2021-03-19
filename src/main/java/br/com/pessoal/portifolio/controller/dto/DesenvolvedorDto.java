package br.com.pessoal.portifolio.controller.dto;

import br.com.pessoal.portifolio.model.Desenvolvedor;
import org.springframework.data.domain.Page;

public class DesenvolvedorDto {

    private String nome;
    private String cargo;

public DesenvolvedorDto(Desenvolvedor desenvolvedor){
    this.nome = desenvolvedor.getNome();
    this.cargo = desenvolvedor.getCargo();
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public static Page<DesenvolvedorDto> converter(Page<Desenvolvedor> desenvolvedores) {
        return desenvolvedores.map(DesenvolvedorDto::new);
    }
}
