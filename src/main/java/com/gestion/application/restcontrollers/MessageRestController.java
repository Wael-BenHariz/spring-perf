package com.gestion.application.restcontrollers;

import com.gestion.application.entities.Message;
import com.gestion.application.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/message")
public class MessageRestController {
    @Autowired
    MessageService messageService ;


    @RequestMapping(method = RequestMethod.GET)
    public List<Message> listeMessages(){
        return messageService.listeMessage() ;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Message ajouterMessage(@RequestBody Message message){
        return messageService.ajouterMessage(message) ;
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
    public void supprimerMessage(@PathVariable("id") Long id){
        messageService.supprimerMessageById(id);
    }
}
