package com.gestion.application.services;

import com.gestion.application.entities.Postulation;
import com.gestion.application.repositorys.PostulationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostulationServiceImpl implements PostulationService{

    @Autowired
    PostulationRepository postulationRepository ;

    @Override
    public Postulation enregistrer(Postulation postulation) {
        return postulationRepository.save(postulation);
    }

    @Override
    public List<Postulation> listPostulations() {
        return postulationRepository.findAll();
    }

    @Override
    public List<Postulation> listPostsFiltredByIdEnt(Long id) {
        return postulationRepository.listPostsByIdEnt(id) ;
    }

    @Override
    public int numberOfPostByOffre(Long id) {
        return postulationRepository.numberOfPostByOffre(id);
    }

    @Override
    public void supprimerPostulation(Long id) {
        postulationRepository.deleteById(id);
    }
}
