/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c4e3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.telacad.j4c4e3.config.ProjectConfig;
import ro.telacad.j4c4e3.service.MyService;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String [] args) {
        try (AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            MyService service = context.getBean(MyService.class);
            for (int i = 0; i<5 ; i++) {
                System.out.println(service.getSomething("some key "));
            }
        }
    }
}
