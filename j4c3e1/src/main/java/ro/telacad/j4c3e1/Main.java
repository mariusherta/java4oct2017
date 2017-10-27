/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c3e1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.telacad.j4c3e1.beans.Cerc;
import ro.telacad.j4c3e1.config.ProjectConfig;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String [] args) {
        try (AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            
            Cerc c = context.getBean(Cerc.class);
            c.setRaza(10);
            double arie = c.getArie();
            System.out.println("ARIE: " + arie);
        }
    }
}
