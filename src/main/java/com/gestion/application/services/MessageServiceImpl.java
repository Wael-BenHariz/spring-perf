package com.gestion.application.services;

import com.gestion.application.entities.Message;
import com.gestion.application.repositorys.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService{

    @Autowired
    MessageRepository messageRepository ;

    @Override
    public Message ajouterMessage(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public Message modifierMessage(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public void supprimerMessageById(Long id) {
        messageRepository.deleteById(id);
    }

    @Override
    public List<Message> listeMessage() {
        return messageRepository.findAll() ;
    }
}
