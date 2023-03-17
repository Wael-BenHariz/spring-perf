package com.gestion.application.services;

import com.gestion.application.entities.OffreDemploi;

import java.util.List;

public interface OffreEmploiService {
    OffreDemploi ajouterOffre(OffreDemploi offre);
    OffreDemploi modifierOffre(OffreDemploi offre);
    void supprimerOffre(OffreDemploi offre);
    void supprimerOffreById(Long id);
    List<OffreDemploi> listeDeOffres();
    List<OffreDemploi> getOffersByIdEnts(Long id) ;
}
