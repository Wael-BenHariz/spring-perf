package com.gestion.application.services;

import com.gestion.application.entities.Commentaire;

import java.util.List;

public interface CommentaireService {
    Commentaire ajouterCommentaire (Commentaire commentaire) ;
    Commentaire modifierCommentaire (Commentaire commentaire);
    void supprimerCommentaire (Commentaire commentaire) ;
    void supprimerCommentaireById(Long id);
    List<Commentaire> listeCommentaire();
}
