/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c2e2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.telacad.j4c2e2.config.MainProjectConfig;
import ro.telacad.j4c2e2.config.OtherProjectConfig;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String [] args) {
        try (AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(MainProjectConfig.class)) {
            
        }
    }
}
