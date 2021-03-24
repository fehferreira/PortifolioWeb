package br.com.pessoal.portifolio.model;

import javax.persistence.*;

@Entity
public class Desenvolvedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nome;

    @Enumerated(EnumType.ORDINAL)
    private AreaAtuacao areaAtuacao;

    @OneToOne
    private Usuario seuUsuario;


}
