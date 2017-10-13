/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c1e1;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import ro.telacad.j4c1e1.beans.Pisica;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String [] args) {
        FileSystemXmlApplicationContext context = 
                new FileSystemXmlApplicationContext("C:\\Users\\student\\Documents\\NetBeansProjects\\j4c1e1\\src\\main\\java\\ro\\telacad\\j4c1e1\\application-context.xml");
        
        Pisica p1= context.getBean("p1", Pisica.class);
        p1.setNume("Tom");
        
        Pisica p2= context.getBean("p2", Pisica.class);
        
        System.out.println(p1.getNume());
        System.out.println(p2.getNume());
    }
}
