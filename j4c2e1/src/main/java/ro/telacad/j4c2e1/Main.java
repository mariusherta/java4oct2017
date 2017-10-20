/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c2e1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.telacad.j4c2e1.beans.Cerc;
import ro.telacad.j4c2e1.beans.Punct;
import ro.telacad.j4c2e1.config.ProjectConfig;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String [] args) {
        try( AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            
            Punct p = context.getBean("punct2", Punct.class);
            p.setX(50);
            p.setY(50);

            Cerc c = context.getBean(Cerc.class);
            System.out.println(c.getCentru().getX() + " " + c.getCentru().getY());
        }
    }
}
