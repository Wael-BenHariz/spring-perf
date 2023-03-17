package com.gestion.application.services;

import com.gestion.application.entities.Condidat;
import com.gestion.application.repositorys.CondidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CondidatServiceImpl implements CondidatService{

    @Autowired
    CondidatRepository condidatRepository ;

    @Override
    public Condidat ajouterCondidat(Condidat condidat) {
        return condidatRepository.save(condidat);
    }

    @Override
    public Condidat modifierCondidat(Condidat condidat) {
        return condidatRepository.save(condidat);
    }

    @Override
    public void supprimerCondidat(Condidat condidat) {
        condidatRepository.delete(condidat);
    }

    @Override
    public void supprimerCondidatById(Long id) {
        condidatRepository.deleteById(id);
    }

    @Override
    public List<Condidat> listeCondidat() {
        return condidatRepository.findAll();
    }
}
