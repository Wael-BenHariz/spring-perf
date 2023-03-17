package com.gestion.application.services;

import com.gestion.application.entities.Message;

import java.util.List;

public interface MessageService {
    Message ajouterMessage(Message message);
    Message modifierMessage(Message message) ;
    void supprimerMessageById(Long id);
    List<Message> listeMessage();
}
