/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c2e8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.telacad.j4c2e8.beans.Pisica;
import ro.telacad.j4c2e8.config.ProjectConfig;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String [] args) {
        try (AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            
            Pisica p = context.getBean(Pisica.class);
            p.sayMiau();
        }
    }
}
