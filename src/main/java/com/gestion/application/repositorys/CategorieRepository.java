package com.gestion.application.repositorys;

import com.gestion.application.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    @Query("select c from Categorie c where c.idCategorie = ?1")
    Categorie getCategorieById(Long id) ;
}
