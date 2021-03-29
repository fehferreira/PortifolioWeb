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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(String experiencias) {
        this.experiencias = experiencias;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public AreaAtuacao getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(AreaAtuacao areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public Senioridade getDevSenioridade() {
        return devSenioridade;
    }

    public void setDevSenioridade(Senioridade devSenioridade) {
        this.devSenioridade = devSenioridade;
    }

    public Set<Tecnologias> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(Set<Tecnologias> tecnologias) {
        this.tecnologias = tecnologias;
    }
}
