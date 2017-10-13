/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c1e3;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import ro.telacad.j4c1e3.beans.Persoana;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String [] args) {
        FileSystemXmlApplicationContext context = 
                new FileSystemXmlApplicationContext("C:\\Users\\student\\Documents\\NetBeansProjects\\j4c1e3\\src\\main\\java\\ro\\telacad\\j4c1e3\\application-context.xml");
    
        Persoana p1 = context.getBean(Persoana.class);
        p1.setNume("Gigel");
        
        Persoana p2 = context.getBean(Persoana.class);
        
        System.out.println(p1.getNume());
        System.out.println(p2.getNume());
    }
}
