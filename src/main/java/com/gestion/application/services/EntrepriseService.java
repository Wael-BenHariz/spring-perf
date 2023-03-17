package com.gestion.application.services;

import com.gestion.application.entities.Entreprise;
import java.util.List;


public interface EntrepriseService {
    Entreprise ajouterEntreprise(Entreprise entreprise);
    Entreprise modifierEntreprise(Entreprise entreprise);
    void supprimerEntreprise(Entreprise entreprise);
    void supprimerEntrepriseByid(Long id);
    List<Entreprise> listeEntreprises() ;
}
