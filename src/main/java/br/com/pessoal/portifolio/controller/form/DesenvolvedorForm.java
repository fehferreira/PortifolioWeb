package br.com.pessoal.portifolio.controller.form;


import br.com.pessoal.portifolio.model.Desenvolvedor;
import br.com.pessoal.portifolio.model.Usuario;
import br.com.pessoal.portifolio.repository.DesenvolvedorRepository;
import br.com.pessoal.portifolio.repository.UsuarioRepository;

public class DesenvolvedorForm {

    private String nome;
    private String sobreNome;
    private String cpf;
    private String endereco;
    private String cargo;

    private Usuario seuUsuario;

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

    public Desenvolvedor converter(UsuarioRepository usuarioRepository) {
        return new Desenvolvedor(this.nome, this.sobreNome, this.cpf, this.endereco, this.cargo, usuarioRepository.findByUsername(this.seuUsuario.getUsername()));
    }


}
