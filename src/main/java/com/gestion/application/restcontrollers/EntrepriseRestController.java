package com.gestion.application.restcontrollers;
import com.gestion.application.entities.Entreprise;
import com.gestion.application.repositorys.EntrepriseRepository;
import com.gestion.application.services.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/entreprise")

public class EntrepriseRestController {

    @Autowired
    EntrepriseService entrepriseService ;

    @Autowired
    EntrepriseRepository entrepriseRepository ;

    @RequestMapping(method = RequestMethod.GET)
    public List<Entreprise> listeEntreprise(){
        return entrepriseService.listeEntreprises();
    }

    @RequestMapping(value = "/id/{id}" , method = RequestMethod.GET)
    public Entreprise getEntrepriseById(@PathVariable("id") Long id) {
        return entrepriseRepository.getEntrepriseById(id) ;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> ajouterEntreprise(@RequestBody Entreprise entreprise){
    	Entreprise test = entrepriseRepository.findByNomEntreprise(entreprise.getNomEntreprise());
    	if(test != null) {
    		return new ResponseEntity<>(HttpStatus.FOUND);
    	}
        entrepriseService.ajouterEntreprise(entreprise);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Entreprise modifierEntreprise(@RequestBody Entreprise entreprise){
        return entrepriseService.modifierEntreprise(entreprise);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void supprimerEntreprise(@PathVariable("id") Long id){
        entrepriseService.supprimerEntrepriseByid(id);
    }

    @RequestMapping(value = "/login/{login}" , method = RequestMethod.GET)
    public Entreprise getEntByLoginOrEmail(@PathVariable("login") String login) {
        return entrepriseRepository.getEntByLoginOrEmail(login);
    }

}
