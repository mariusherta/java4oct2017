/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c2e5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.telacad.j4c2e5.beans.Casa;
import ro.telacad.j4c2e5.beans.Pisica;
import ro.telacad.j4c2e5.config.ProjectConfig;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String [] args) {
        try (AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Casa casa = context.getBean(Casa.class);
            Pisica p = casa.getPisica();
            System.out.println(p.getNume());
        }
    }
}
