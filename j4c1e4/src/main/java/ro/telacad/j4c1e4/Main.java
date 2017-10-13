/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c1e4;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import ro.telacad.j4c1e4.beans.Carte;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String [] args) {
        FileSystemXmlApplicationContext context = 
                new FileSystemXmlApplicationContext("C:\\Users\\student\\Documents\\NetBeansProjects\\j4c1e4\\src\\main\\java\\ro\\telacad\\j4c1e4\\application-context.xml");
    
        Carte c = context.getBean(Carte.class);
        
        c.getAutori().forEach(System.out::println);
    }
}
