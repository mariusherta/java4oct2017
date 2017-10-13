/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c1e6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.telacad.j4c1e6.beans.Pisica;
import ro.telacad.j4c1e6.config.ProjectConfig;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String [] args) {
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        
        Pisica p1 = context.getBean(Pisica.class);
        p1.setNume("Tom");
        
        Pisica p2 = context.getBean(Pisica.class);
        
        System.out.println(p1.getNume());
        System.out.println(p2.getNume());
    }
}
