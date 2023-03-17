package com.gestion.application.restcontrollers;

import com.gestion.application.entities.Postulation;
import com.gestion.application.services.PostulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/post")
public class PostulationRestController {

    @Autowired
    PostulationService postulationService ;

    @RequestMapping(method = RequestMethod.GET)
    public List<Postulation> listPosts() {
        return postulationService.listPostulations();
    }

    @RequestMapping(value = "/id/{id}" , method = RequestMethod.GET)
    public List<Postulation> listPostsFiltredByIdEnt(@PathVariable("id") Long id){
        return postulationService.listPostsFiltredByIdEnt(id);
    }

    @RequestMapping(value = "/count/{id}", method = RequestMethod.GET)
    public int listOfPostsByOffer(@PathVariable("id") Long id) {
        return postulationService.numberOfPostByOffre(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Postulation ajoutPost(@RequestBody Postulation post) {
        return postulationService.enregistrer(post) ;
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
    public void supprimerPost(@PathVariable("id") Long id) {
        postulationService.supprimerPostulation(id);
    }
}
