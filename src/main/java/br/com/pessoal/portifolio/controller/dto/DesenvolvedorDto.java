package br.com.pessoal.portifolio.controller.dto;

import br.com.pessoal.portifolio.model.AreaAtuacao;
import br.com.pessoal.portifolio.model.Desenvolvedor;
import br.com.pessoal.portifolio.model.Senioridade;
import br.com.pessoal.portifolio.model.Usuario;
import br.com.pessoal.portifolio.repository.UsuarioRepository;
import org.springframework.data.domain.Page;

public class DesenvolvedorDto {

    private String nome;
    private Usuario seuUsuario;
    private String telefone;
    private AreaAtuacao suaArea;
    private Senioridade suaSenioridade;

    public DesenvolvedorDto(Desenvolvedor desenvolvedor) {
        this.nome = desenvolvedor.getNome();
        this.seuUsuario = desenvolvedor.getSeuUsuario();
        this.telefone = desenvolvedor.getNumeroTelefone();
        this.suaArea = desenvolvedor.getAreaAtuacao();
        this.suaSenioridade = desenvolvedor.getDevSenioridade();
    }

    public static DesenvolvedorDto converter(Desenvolvedor desenvolvedor) {
        return new DesenvolvedorDto(desenvolvedor);
    }

    public static Page<DesenvolvedorDto> converter(Page<Desenvolvedor> desenvolvedores) {
        return desenvolvedores.map(DesenvolvedorDto::new);
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
