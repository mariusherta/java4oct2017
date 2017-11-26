/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c6e2;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import ro.telacad.j4c6e2.service.MessageService;

/**
 *
 * @author student
 */
public class Main {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = 
                new FileSystemXmlApplicationContext("C:\\Users\\student\\Documents\\NetBeansProjects\\j4c6e2\\src\\main\\java\\ro\\telacad\\j4c6e2\\appConfig.xml");
        
        MessageService service = context.getBean(MessageService.class);
        
        service.sendMessage("HELLO");
    }
}
