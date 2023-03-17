package com.gestion.application.restcontrollers;


import com.gestion.application.entities.Administrator;
import com.gestion.application.repositorys.AdministratorRepository;
import com.gestion.application.services.AdministratorService;
import com.gestion.application.services.AdministratorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/admin")
public class AdministratorRestController {

    @Autowired
    AdministratorService administratorService;

    @Autowired
    AdministratorRepository administratorRepository ;

    @RequestMapping(method = RequestMethod.GET)
    public List<Administrator> listeDesAdmin(){
        return administratorService.listeAdmins();
    }

    @RequestMapping(value = "/{loginAdmin}" ,method = RequestMethod.GET)
    public Administrator getAdminByUserName(@PathVariable("loginAdmin") String loginAdmin){
        return administratorRepository.findByAdminLogin(loginAdmin);
    }

    @RequestMapping(value = "/id/{id}" ,method = RequestMethod.GET)
    public Administrator getAdminByUserName(@PathVariable("id") Long id){
        return administratorRepository.findByAdminId(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Administrator ajouterAdmin(@RequestBody Administrator administrator){
        return administratorService.ajouterAdmin(administrator);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Administrator modifierAdmin(@RequestBody Administrator administrator){
        return administratorService.modifierAdmin(administrator);
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
    public void supprimerAdmin(@PathVariable("id") Long id){
        administratorService.supprimerAdminByid(id);
    }

}
