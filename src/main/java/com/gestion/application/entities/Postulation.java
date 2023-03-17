package com.gestion.application.entities;


import javax.persistence.*;

@Entity
public class Postulation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPostule ;
    private String nomCondidat ;
    private String prenomCondidat ;
    private String emailCondidat ;
    private String telCondidat ;
    private String postulerCondidat ;

    @ManyToOne
    private OffreDemploi offre ;


    public Long getIdPostule() {
        return idPostule;
    }

    public String getNomCondidat() {
        return nomCondidat;
    }

    public String getPrenomCondidat() {
        return prenomCondidat;
    }

    public String getEmailCondidat() {
        return emailCondidat;
    }

    public String getTelCondidat() {
        return telCondidat;
    }

    public String getPostulerCondidat() {
        return postulerCondidat;
    }

    public OffreDemploi getOffre() {
        return offre;
    }
}
