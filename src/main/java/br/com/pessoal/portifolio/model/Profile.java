package br.com.pessoal.portifolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profile{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;

    public Profile(String type) {
        this.type = type;
    }

    @Deprecated
    public Profile() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
