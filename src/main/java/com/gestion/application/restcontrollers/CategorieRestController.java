package com.gestion.application.restcontrollers;


import com.gestion.application.entities.Categorie;
import com.gestion.application.repositorys.CategorieRepository;
import com.gestion.application.services.CategorieService;
import com.gestion.application.services.CategorieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/categorie")
public class CategorieRestController {

    @Autowired
    CategorieService categorieService ;

    @Autowired
    CategorieRepository categorieRepository ;

    @RequestMapping(method = RequestMethod.GET)
    public List<Categorie> listeCategorie(){
        return categorieService.listeCatergorie();
    }

    @RequestMapping(value = "/id/{id}" , method = RequestMethod.GET)
    public Categorie getCategorieById(@PathVariable("id") Long id){
        return categorieRepository.getCategorieById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Categorie ajouterCategorie(@RequestBody Categorie categorie){
        return categorieService.ajouterCategorie(categorie);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Categorie modifierCategorie(@RequestBody Categorie categorie){
        return categorieService.modifierCategorie(categorie);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCategorie(@PathVariable("id") Long id){
        categorieService.supprimerCategorieById(id);
    }
}
