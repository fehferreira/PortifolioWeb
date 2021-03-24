package br.com.pessoal.portifolio.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Desenvolvedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private String experiencias;

    @OneToOne
    private Usuario seuUsuario;

    private String numeroTelefone;

    @Enumerated(EnumType.ORDINAL)
    private AreaAtuacao areaAtuacao;

    @Enumerated(EnumType.STRING)
    private Senioridade devSenioridade;

    @Enumerated(EnumType.ORDINAL)
    private Set<Tecnologias> suaTecnologia;

    public Desenvolvedor(String nome, String experiencias, Usuario seuUsuario, String numeroTelefone, AreaAtuacao areaAtuacao, Senioridade devSenioridade, Set<Tecnologias> suaTecnologia) {
        this.nome = nome;
        this.experiencias = experiencias;
        this.seuUsuario = seuUsuario;
        this.numeroTelefone = numeroTelefone;
        this.areaAtuacao = areaAtuacao;
        this.devSenioridade = devSenioridade;
        this.suaTecnologia = suaTecnologia;
    }

    @Deprecated
    public Desenvolvedor() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public Usuario getSeuUsuario() {
        return seuUsuario;
    }

    public void setSeuUsuario(Usuario seuUsuario) {
        this.seuUsuario = seuUsuario;
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

    public Set<Tecnologias> getSuaTecnologia() {
        return suaTecnologia;
    }

    public void setSuaTecnologia(Set<Tecnologias> suaTecnologia) {
        this.suaTecnologia = suaTecnologia;
    }
}
