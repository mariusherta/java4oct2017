/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c6e2.service;

import javax.jms.Destination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author student
 */
@Service
public class MessageService {
    
    @Autowired
    private JmsTemplate jmsTemplate;
    
    @Autowired
    private Destination destination;
    
    public void sendMessage(String mesaj) {
        jmsTemplate.convertAndSend(destination, mesaj);
    }
}
