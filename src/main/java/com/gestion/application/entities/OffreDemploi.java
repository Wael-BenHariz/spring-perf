package com.gestion.application.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class OffreDemploi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOffre ;
    private String titreOffre ;
    private String descriptionOffre ;
    private String offreEmploi ;
    private String adresseOffre ;
    private String salaireOffre ;
    private String niveauEtudeOffre ;
    private String experienceOffre ;
    private String typeDeContratOffre ;
    private String exigenceOffre ;

    @ManyToOne
    private Entreprise entreprise;

    @ManyToOne
    private Categorie categorie;

    @JsonIgnore
    @OneToMany(mappedBy = "offre")
    private List<Postulation> postulations ;

    public Long getIdOffre() {
        return idOffre;
    }

    public String getTitreOffre() {
        return titreOffre;
    }

    public String getDescriptionOffre() {
        return descriptionOffre;
    }

    public String getOffreEmploi() {
        return offreEmploi;
    }

    public String getAdresseOffre() {
        return adresseOffre;
    }

    public String getSalaireOffre() {
        return salaireOffre;
    }

    public String getNiveauEtudeOffre() {
        return niveauEtudeOffre;
    }

    public String getExperienceOffre() {
        return experienceOffre;
    }

    public String getTypeDeContratOffre() {
        return typeDeContratOffre;
    }

    public String getExigenceOffre() {
        return exigenceOffre;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public Categorie getCategorie() {
        return categorie;
    }

}
