package com.gestion.application.repositorys;

import com.gestion.application.entities.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AdministratorRepository extends JpaRepository<Administrator, Long> {
    @Query("select a from Administrator a where a.loginAdmin = ?1")
    Administrator findByAdminLogin(String loginAdmin);

    @Query("select a from Administrator a where a.idAdmin = ?1")
    Administrator findByAdminId(Long idAdmin);

}
