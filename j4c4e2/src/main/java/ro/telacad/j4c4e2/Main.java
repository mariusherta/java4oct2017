/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c4e2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.telacad.j4c4e2.config.ProjectConfig;
import ro.telacad.j4c4e2.entities.Produs;
import ro.telacad.j4c4e2.service.ProdusService;

/**
 *
 * @author student
 */
public class Main {
    public static AnnotationConfigApplicationContext context;
    
    public static void main(String [] args) {
        try (AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            ProdusService service = context.getBean(ProdusService.class);
            
            Produs p = new Produs();
            p.setNume("bere");
            p.setPret(5);
            
            service.adaugaProdus(p);
        }
    }
}
