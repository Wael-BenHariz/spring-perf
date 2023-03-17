package com.gestion.application.repositorys;

import com.gestion.application.entities.Postulation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostulationRepository extends JpaRepository<Postulation,Long> {
    @Query("select p from Postulation p where p.offre.entreprise.idEntreprise = ?1")
    public List<Postulation> listPostsByIdEnt(Long id);

    @Query("select count(p) from Postulation p where p.offre.idOffre = ?1")
    public int numberOfPostByOffre(Long id);
}
