package com.gestion.application.services;

import com.gestion.application.entities.Commentaire;
import com.gestion.application.repositorys.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentaireServiceImpl implements CommentaireService{

    @Autowired
    CommentaireRepository commentaireRepository ;


    @Override
    public Commentaire ajouterCommentaire(Commentaire commentaire) {
        return commentaireRepository.save(commentaire) ;
    }

    @Override
    public Commentaire modifierCommentaire(Commentaire commentaire) {
        return commentaireRepository.save(commentaire) ;
    }

    @Override
    public void supprimerCommentaire(Commentaire commentaire) {
        commentaireRepository.delete(commentaire);
    }

    @Override
    public void supprimerCommentaireById(Long id) {
        commentaireRepository.deleteById(id);
    }

    @Override
    public List<Commentaire> listeCommentaire() {
        return commentaireRepository.findAll();
    }
}
