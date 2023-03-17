package com.gestion.application.entities;

import javax.persistence.*;

@Entity
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommentaire ;
    private String nomCommentaire ;
    private String emailCommentaire ;
    private String sujetCommentaire ;


    @ManyToOne
    private Condidat condidatCommenter ;

    public Long getIdCommentaire() {
        return idCommentaire;
    }

    public String getNomCommentaire() {
        return nomCommentaire;
    }

    public String getEmailCommentaire() {
        return emailCommentaire;
    }

    public String getSujetCommentaire() {
        return sujetCommentaire;
    }

    public Condidat getCondidatCommenter() {
        return condidatCommenter;
    }
}
