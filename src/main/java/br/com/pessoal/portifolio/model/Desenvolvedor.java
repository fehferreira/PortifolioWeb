package br.com.pessoal.portifolio.model;

import javax.persistence.*;

@Entity
public class Desenvolvedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private String numeroTelefone;

    @Enumerated(EnumType.ORDINAL)
    private AreaAtuacao areaAtuacao;

    @Enumerated(EnumType.STRING)
    private Senioridade devSenioridade;

    @OneToOne
    private Usuario seuUsuario;


}
