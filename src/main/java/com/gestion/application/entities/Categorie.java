package com.gestion.application.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategorie ;
    private String titreCategorie;
    private String descriptionCategorie;

    @JsonIgnore
    @OneToMany(mappedBy = "categorie")
    private List<OffreDemploi> offres ;

    public Long getIdCategorie() {
        return idCategorie;
    }

    public String getTitreCategorie() {
        return titreCategorie;
    }

    public String getDescriptionCategorie() {
        return descriptionCategorie;
    }


    public List<OffreDemploi> getOffres() {
        return offres;
    }
}
