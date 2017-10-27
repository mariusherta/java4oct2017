/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c3e2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.telacad.j4c3e2.beans.Calculator;
import ro.telacad.j4c3e2.config.ProjectConfig;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String [] args) {
        try (AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Calculator c = context.getBean(Calculator.class);
            int suma = c.suma(10, 20);
            System.out.println(suma);
        }
    }
}
