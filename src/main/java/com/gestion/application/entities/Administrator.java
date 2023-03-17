package com.gestion.application.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Administrator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdmin ;
    private String nomAdmin;
    private String prenomAdmin;
    private String emailAdmin ;
    private String loginAdmin ;
    private String passwordAdmin;
    private String roleAdmin ;

    public Long getIdAdmin() {
        return idAdmin;
    }

    public String getNomAdmin() {
        return nomAdmin;
    }

    public String getPrenomAdmin() {
        return prenomAdmin;
    }

    public String getEmailAdmin() {
        return emailAdmin;
    }

    public String getLoginAdmin() {
        return loginAdmin;
    }

    public String getPasswordAdmin() {
        return passwordAdmin;
    }

    public String getRoleAdmin() {
        return roleAdmin;
    }
}
