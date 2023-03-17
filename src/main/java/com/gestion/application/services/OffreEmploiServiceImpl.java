package com.gestion.application.services;

import com.gestion.application.entities.OffreDemploi;
import com.gestion.application.repositorys.OffreDemploiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffreEmploiServiceImpl implements OffreEmploiService{

    @Autowired
    OffreDemploiRepository offreDemploiRepository ;


    @Override
    public OffreDemploi ajouterOffre(OffreDemploi offre) {
        return offreDemploiRepository.save(offre) ;
    }

    @Override
    public OffreDemploi modifierOffre(OffreDemploi offre) {
        return offreDemploiRepository.save(offre);
    }

    @Override
    public void supprimerOffre(OffreDemploi offre) {
        offreDemploiRepository.delete(offre);
    }

    @Override
    public void supprimerOffreById(Long id) {
        offreDemploiRepository.deleteById(id);
    }

    @Override
    public List<OffreDemploi> listeDeOffres() {
        return offreDemploiRepository.findAll();
    }

    @Override
    public List<OffreDemploi> getOffersByIdEnts(Long id) {
        return offreDemploiRepository.getOffersByIdEnts(id);
    }
}
