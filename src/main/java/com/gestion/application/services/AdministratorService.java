package com.gestion.application.services;

import com.gestion.application.entities.Administrator;

import java.util.List;

public interface AdministratorService {
    Administrator ajouterAdmin(Administrator administrator);
    Administrator modifierAdmin(Administrator administrator);
    void supprimerAdmin(Administrator administrator);
    void supprimerAdminByid(Long id);
    List<Administrator> listeAdmins() ;
}
