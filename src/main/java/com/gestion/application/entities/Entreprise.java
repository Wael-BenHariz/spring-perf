package com.gestion.application.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Entreprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEntreprise ;
    private String nomEntreprise ;
    private String descriptionEnt ;
    private String raisonSocialEnt ;
    private String matriculeFiscaleEnt ;
    private String adresseEnt ;
    private String emailEnt ;
    private String telephoneEnt ;
    private String loginEnt ;
    private String passwordEnt ;

    @JsonIgnore
    @OneToMany(mappedBy = "entrepriseMessage")
    private List<Message> messages;

    @JsonIgnore
    @OneToMany(mappedBy = "entreprise")
    private List<OffreDemploi> offres ;

    @ManyToOne
    private Image image ;

    public Long getIdEntreprise() {
        return idEntreprise;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public String getDescriptionEnt() {
        return descriptionEnt;
    }

    public String getRaisonSocialEnt() {
        return raisonSocialEnt;
    }

    public String getMatriculeFiscaleEnt() {
        return matriculeFiscaleEnt;
    }

    public String getAdresseEnt() {
        return adresseEnt;
    }

    public String getEmailEnt() {
        return emailEnt;
    }

    public String getTelephoneEnt() {
        return telephoneEnt;
    }

    public String getLoginEnt() {
        return loginEnt;
    }

    public String getPasswordEnt() {
        return passwordEnt;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public List<OffreDemploi> getOffres() {
        return offres;
    }

    public Image getImage() {
        return image;
    }
}
