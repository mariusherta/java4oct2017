/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c1e5;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import ro.telacad.j4c1e5.beans.Cerc;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String [] args) {
        FileSystemXmlApplicationContext context = 
                new FileSystemXmlApplicationContext("C:\\Users\\student\\Documents\\NetBeansProjects\\j4c1e5\\src\\main\\java\\ro\\telacad\\j4c1e5\\application-context.xml");
        
        Cerc c = context.getBean(Cerc.class);
        
        System.out.println(c.getRaza());
        System.out.println(c.getCentru().getX());
        System.out.println(c.getCentru().getY());
    }
    
}
