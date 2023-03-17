package com.gestion.application.services;

import com.gestion.application.entities.Condidat;

import java.util.List;

public interface CondidatService {
    Condidat ajouterCondidat(Condidat condidat);
    Condidat modifierCondidat(Condidat condidat);
    void supprimerCondidat(Condidat condidat);
    void supprimerCondidatById(Long id);
    List<Condidat> listeCondidat();
}
