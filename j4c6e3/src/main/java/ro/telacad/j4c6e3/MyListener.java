/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c6e3;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author student
 */
public class MyListener implements MessageListener {

    @Override
    public void onMessage(Message msg) {
        try {
            TextMessage tm = (TextMessage) msg;
            System.out.println(tm.getText());
        } catch (JMSException ex) {
            Logger.getLogger(MyListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
