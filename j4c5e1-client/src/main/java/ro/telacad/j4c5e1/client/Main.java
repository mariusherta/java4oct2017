/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c5e1.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.telacad.j4c5e1.client.config.ProjectConfig;
import ro.telacad.j4c5e1.services.MyService;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String [] args) {
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        
        MyService service = context.getBean(MyService.class);
        System.out.println(service.sayHello("John"));
    }
}
