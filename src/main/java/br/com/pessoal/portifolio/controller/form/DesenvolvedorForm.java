package br.com.pessoal.portifolio.controller.form;


import br.com.pessoal.portifolio.model.*;
import br.com.pessoal.portifolio.repository.UsuarioRepository;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;

public class DesenvolvedorForm {

    private String nome;
    private String experiencias;
    private Usuario seuUsuario;
    private String telefone;
    private AreaAtuacao suaArea;
    private Senioridade suaSenioridade;
    private Set<Tecnologias> suaTecnologia;

    public Desenvolvedor converter(UsuarioRepository usuarioRepository) {
        return new Desenvolvedor(this.nome,this.experiencias,usuarioRepository.findByUsername(this.seuUsuario.getUsername()),
                this.telefone,this.suaArea,this.suaSenioridade,this.suaTecnologia);
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public AreaAtuacao getSuaArea() {
        return suaArea;
    }

    public void setSuaArea(AreaAtuacao suaArea) {
        this.suaArea = suaArea;
    }

    public Senioridade getSuaSenioridade() {
        return suaSenioridade;
    }

    public void setSuaSenioridade(Senioridade suaSenioridade) {
        this.suaSenioridade = suaSenioridade;
    }

    public Set<Tecnologias> getSuaTecnologia() {
        return suaTecnologia;
    }

    public void setSuaTecnologia(Set<Tecnologias> suaTecnologia) {
        this.suaTecnologia = suaTecnologia;
    }
}
