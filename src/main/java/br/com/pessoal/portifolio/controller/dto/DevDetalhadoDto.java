package br.com.pessoal.portifolio.controller.dto;

import br.com.pessoal.portifolio.model.*;

import java.util.Set;

public class DevDetalhadoDto {

    private Long id;
    private String nome;
    private String experiencias;
    private String username;
    private String numeroTelefone;

    private AreaAtuacao areaAtuacao;
    private Senioridade devSenioridade;
    private Set<Tecnologias> tecnologias;

    public DevDetalhadoDto(Desenvolvedor desenvolvedor) {
        this.id = desenvolvedor.getId();
        this.nome = desenvolvedor.getNome();
        this.experiencias = desenvolvedor.getExperiencias();
        this.numeroTelefone = desenvolvedor.getNumeroTelefone();
        this.areaAtuacao = desenvolvedor.getAreaAtuacao();
        this.devSenioridade = desenvolvedor.getDevSenioridade();
        this.tecnologias = desenvolvedor.getSuaTecnologia();
        this.username = desenvolvedor.getSeuUsuario().getUsername();
    }

    public static DevDetalhadoDto converter(Desenvolvedor desenvolvedor){
        return new DevDetalhadoDto(desenvolvedor);
    }
}
