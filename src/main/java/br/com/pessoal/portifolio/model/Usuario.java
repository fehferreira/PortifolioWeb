package br.com.pessoal.portifolio.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

    @Id
    private String username;
    private String password;
    private Profile profile;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
