package com.gestion.application.services;

import com.gestion.application.entities.Postulation;

import java.util.List;

public interface PostulationService {
    public Postulation enregistrer(Postulation postulation) ;
    public List<Postulation> listPostulations() ;
    public List<Postulation> listPostsFiltredByIdEnt(Long id);
    public int numberOfPostByOffre(Long id) ;
    public void supprimerPostulation(Long id) ;
}
