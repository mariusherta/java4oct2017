/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c1e7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.telacad.j4c1e7.beans.Cerc;
import ro.telacad.j4c1e7.beans.Punct;
import ro.telacad.j4c1e7.config.ProjectConfig;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String [] args) {
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        
        Punct p = context.getBean(Punct.class);
        p.setX(10);
        p.setY(20);
        
        Cerc c = context.getBean(Cerc.class);
        
        System.out.println(c.getCentru().getX());
        System.out.println(c.getCentru().getY());
    }
}
