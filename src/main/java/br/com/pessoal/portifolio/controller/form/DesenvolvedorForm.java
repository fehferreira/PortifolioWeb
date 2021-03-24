package br.com.pessoal.portifolio.controller.form;


import br.com.pessoal.portifolio.model.AreaAtuacao;
import br.com.pessoal.portifolio.model.Desenvolvedor;
import br.com.pessoal.portifolio.model.Senioridade;
import br.com.pessoal.portifolio.model.Usuario;
import br.com.pessoal.portifolio.repository.UsuarioRepository;

import java.util.HashSet;

public class DesenvolvedorForm {

    private String nome;
    private Usuario seuUsuario;
    private String telefone;
    private AreaAtuacao suaArea;
    private Senioridade suaSenioridade;

    public Desenvolvedor converter(UsuarioRepository usuarioRepository) {
        return new Desenvolvedor(this.nome,null,usuarioRepository.findByUsername(this.seuUsuario.getUsername()),
                this.telefone,this.suaArea,this.suaSenioridade,null);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
}
