package com.gestion.application.services;

import com.gestion.application.entities.Administrator;
import com.gestion.application.repositorys.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorServiceImpl implements AdministratorService{

    @Autowired
    AdministratorRepository administratorRepository ;

    @Override
    public Administrator ajouterAdmin(Administrator administrator) {
        return administratorRepository.save(administrator);
    }


    @Override
    public Administrator modifierAdmin(Administrator administrator) {
        return administratorRepository.save(administrator);
    }

    @Override
    public void supprimerAdmin(Administrator administrator) {
        administratorRepository.delete(administrator);
    }

    @Override
    public void supprimerAdminByid(Long id) {
        administratorRepository.deleteById(id);
    }

    @Override
    public List<Administrator> listeAdmins() {
        return administratorRepository.findAll();
    }


}
