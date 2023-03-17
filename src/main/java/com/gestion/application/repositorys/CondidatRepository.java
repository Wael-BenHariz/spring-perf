package com.gestion.application.repositorys;

import com.gestion.application.entities.Condidat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CondidatRepository extends JpaRepository<Condidat,Long> {
    @Query("select c from Condidat c where c.idCondidat = ?1")
    Condidat getCondidatById(Long id) ;

    @Query("select c from Condidat c where c.emailCondidat = ?1 or c.loginCondidat = ?1")
    Condidat getCondidatByLoginOrEmail(String logOremail);

}
