package com.gestion.application.entities;

import javax.persistence.*;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMessage ;
    private String nomMessage ;
    private String emailMessage ;
    private String sujetMessage ;
    private String contenuMessage ;

    // Condidat envoyer message //

    @ManyToOne
    private Condidat condidatMessage ;

    // Entreprise envoyer message //

    @ManyToOne
    private Entreprise entrepriseMessage;

    public Long getIdMessage() {
        return idMessage;
    }

    public String getNomMessage() {
        return nomMessage;
    }

    public String getEmailMessage() {
        return emailMessage;
    }

    public String getSujetMessage() {
        return sujetMessage;
    }

    public String getContenuMessage() {
        return contenuMessage;
    }

    public Condidat getCondidatMessage() {
        return condidatMessage;
    }

    public Entreprise getEntrepriseMessage() {
        return entrepriseMessage;
    }
}
