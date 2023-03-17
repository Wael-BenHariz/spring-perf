package com.gestion.application.repositorys;

import com.gestion.application.entities.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EntrepriseRepository extends JpaRepository<Entreprise,Long> {
    @Query("select e from Entreprise e where e.idEntreprise = ?1")
    Entreprise getEntrepriseById(Long id) ;

    @Query("select e from Entreprise e where e.emailEnt = ?1 or e.loginEnt = ?1")
    Entreprise getEntByLoginOrEmail(String login) ;
    
    Entreprise findByNomEntreprise(String nomEntreprise);
}
