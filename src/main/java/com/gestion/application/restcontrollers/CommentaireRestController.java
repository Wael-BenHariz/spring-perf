package com.gestion.application.restcontrollers;


import com.gestion.application.entities.Commentaire;
import com.gestion.application.services.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/commentaire")
public class CommentaireRestController {

    @Autowired
    CommentaireService commentaireService ;

    @RequestMapping(method = RequestMethod.GET)
    public List<Commentaire> listeCommentaire() {
        return commentaireService.listeCommentaire();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Commentaire ajouteCommentaire(@RequestBody Commentaire commentaire){
        return commentaireService.ajouterCommentaire(commentaire);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void supprimerCommentaire(@PathVariable("id") Long id) {
        commentaireService.supprimerCommentaireById(id);
    }
}
