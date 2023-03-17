package com.gestion.application.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Condidat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCondidat ;
    private String nomCondidat ;
    private String prenomCondidat ;
    private String emailCondidat ;
    private String telephoneCondidat ;
    private String loginCondidat ;
    private String passwordCondidat ;
    private String postulerCondidat ;

    @JsonIgnore
    @OneToMany(mappedBy = "condidatMessage")
    private List<Message> messages ;

    @JsonIgnore
    @OneToMany(mappedBy = "condidatCommenter")
    private List<Commentaire> commentaires;


    public Long getIdCondidat() {
        return idCondidat;
    }

    public String getNomCondidat() {
        return nomCondidat;
    }

    public String getPrenomCondidat() {
        return prenomCondidat;
    }

    public String getEmailCondidat() {
        return emailCondidat;
    }

    public String getTelephoneCondidat() {
        return telephoneCondidat;
    }

    public String getLoginCondidat() {
        return loginCondidat;
    }

    public String getPasswordCondidat() {
        return passwordCondidat;
    }

    public String getPostulerCondidat() {
        return postulerCondidat;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

}
