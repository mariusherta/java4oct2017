/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c2e3;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import ro.telacad.j4c2e3.beans.Punct;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String [] args) {
        FileSystemXmlApplicationContext context = 
                new FileSystemXmlApplicationContext("C:\\Users\\student\\Documents\\NetBeansProjects\\j4c2e3\\src\\main\\java\\ro\\telacad\\j4c2e3\\application-config.xml");
        
        Punct p = context.getBean(Punct.class);
        
        context.close();
    }
}
