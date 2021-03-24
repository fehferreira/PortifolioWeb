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

    @OneToOne
    @Enumerated(EnumType.ORDINAL)
    private Set<Tecnologias> suaTecnologia;

}
