package com.gestion.application.repositorys;

import com.gestion.application.entities.OffreDemploi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OffreDemploiRepository extends JpaRepository<OffreDemploi,Long> {
    @Query("select o from OffreDemploi o where o.idOffre = ?1")
    OffreDemploi getOffreById(Long id);

    @Query("select o from OffreDemploi o where o.entreprise.idEntreprise = ?1")
    List<OffreDemploi> getOffersByIdEnts(Long id) ;
}
