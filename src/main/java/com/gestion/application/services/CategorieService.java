package com.gestion.application.services;

import com.gestion.application.entities.Categorie;

import java.util.List;

public interface CategorieService {
    Categorie ajouterCategorie(Categorie categorie);
    void supprimerCategorieById(Long id);
    Categorie modifierCategorie(Categorie categorie);
    List<Categorie> listeCatergorie();
}
