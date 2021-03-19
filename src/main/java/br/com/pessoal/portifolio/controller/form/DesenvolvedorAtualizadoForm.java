package br.com.pessoal.portifolio.controller.form;

import br.com.pessoal.portifolio.model.Usuario;

public class DesenvolvedorAtualizadoForm {

    private Long id;
    private String nome;
    private String sobreNome;
    private String cpf;
    private String endereco;
    private String cargo;

    private Usuario seuUsuario;


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

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Usuario getSeuUsuario() {
        return seuUsuario;
    }

    public void setSeuUsuario(Usuario seuUsuario) {
        this.seuUsuario = seuUsuario;
    }
}
