package com.gestion.application.restcontrollers;



import com.gestion.application.entities.OffreDemploi;
import com.gestion.application.repositorys.OffreDemploiRepository;
import com.gestion.application.services.OffreEmploiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/offre")
public class OffreDemploiRestController {

    @Autowired
    OffreEmploiService offreEmploiService ;

    @Autowired
    OffreDemploiRepository offreDemploiRepository ;

    @RequestMapping(method = RequestMethod.GET)
    public List<OffreDemploi> listeDesOffres(){
        return offreEmploiService.listeDeOffres();
    }

    @RequestMapping(value = "/id/{id}" , method = RequestMethod.GET)
    public OffreDemploi getOffreById(@PathVariable("id") Long id){
        return offreDemploiRepository.getOffreById(id) ;
    }

    @RequestMapping(value = "/entid/{id}" , method = RequestMethod.GET)
    public List<OffreDemploi> getOffresByIdEnts(@PathVariable("id") Long id) {
        return offreEmploiService.getOffersByIdEnts(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public OffreDemploi ajouterOffre(@RequestBody OffreDemploi offre){
        return offreEmploiService.ajouterOffre(offre) ;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public OffreDemploi modifierOffre(@RequestBody OffreDemploi offre){
        return offreEmploiService.modifierOffre(offre);
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
    public void supprimerAdmin(@PathVariable("id") Long id){
        offreEmploiService.supprimerOffreById(id);
    }
}
