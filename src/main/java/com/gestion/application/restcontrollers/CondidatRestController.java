package com.gestion.application.restcontrollers;

import com.gestion.application.entities.Condidat;
import com.gestion.application.repositorys.CondidatRepository;
import com.gestion.application.services.CondidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/condidat")

public class CondidatRestController {

    @Autowired
    CondidatService condidatService ;

    @Autowired
    CondidatRepository condidatRepository ;


    @RequestMapping(method = RequestMethod.GET)
    public List<Condidat> listeConidat(){
        return condidatService.listeCondidat();
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public Condidat getCondidatById(@PathVariable("id") Long id){
        return condidatRepository.getCondidatById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Condidat ajouterCondidat(@RequestBody Condidat condidat){
        return condidatService.ajouterCondidat(condidat);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Condidat modifierCondidat(@RequestBody Condidat condidat){
        return condidatService.modifierCondidat(condidat);
    }


    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
    public void supprimerCondidat(@PathVariable("id") Long id){
        condidatService.supprimerCondidatById(id);
    }

    @RequestMapping(value = "/login/{login}" , method = RequestMethod.GET)
    public Condidat getCondidatByLoginOrEmail(@PathVariable("login") String par) {
        return condidatRepository.getCondidatByLoginOrEmail(par) ;
    }

}
