package com.gestion.application.services;

import com.gestion.application.entities.Entreprise;
import com.gestion.application.repositorys.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrepriseServiceImpl implements EntrepriseService{

    @Autowired
    EntrepriseRepository entrepriseRepository;

    @Override
    public Entreprise ajouterEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public Entreprise modifierEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public void supprimerEntreprise(Entreprise entreprise) {
        entrepriseRepository.delete(entreprise);
    }

    @Override
    public void supprimerEntrepriseByid(Long id) {
        entrepriseRepository.deleteById(id);
    }

    @Override
    public List<Entreprise> listeEntreprises() {
        return entrepriseRepository.findAll();
    }
}
