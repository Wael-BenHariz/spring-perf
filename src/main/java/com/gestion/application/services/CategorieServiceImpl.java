package com.gestion.application.services;

import com.gestion.application.entities.Categorie;
import com.gestion.application.repositorys.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategorieServiceImpl implements CategorieService{

    @Autowired
    CategorieRepository categorieRepository ;

    @Override
    public Categorie ajouterCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public void supprimerCategorieById(Long id) {
        categorieRepository.deleteById(id);
    }

    @Override
    public Categorie modifierCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public List<Categorie> listeCatergorie() {
        return categorieRepository.findAll();
    }
}
