package br.com.pessoal.portifolio.model;

import javax.persistence.*;

@Entity
public class Desenvolvedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private String sobreNome;
    private String cpf;
    private String endereco;
    private String cargo;

    @OneToOne
    private Usuario seuUsuario;

    public Desenvolvedor(String nome, String sobreNome, String cpf, String endereco, String cargo, Usuario byUsername) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cargo = cargo;
        this.seuUsuario = byUsername;
    }

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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
}
