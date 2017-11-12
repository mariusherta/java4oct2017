/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c4e1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.telacad.j4c4e1.config.ProjectConfig;
import ro.telacad.j4c4e1.service.PersoanaService;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String [] args) {
        try (AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            PersoanaService service = context.getBean(PersoanaService.class);
            service.adaugaZecePersoane();
        }
    }
    
}
