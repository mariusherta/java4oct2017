/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c2e6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.telacad.j4c2e6.beans.Cerc;
import ro.telacad.j4c2e6.beans.Matematician;
import ro.telacad.j4c2e6.config.ProjectConfig;

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
            
            Matematician m = context.getBean(Matematician.class);
            System.out.println(m.calculeaza());
        }
    }
}
