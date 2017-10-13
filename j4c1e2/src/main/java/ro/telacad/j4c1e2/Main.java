/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c1e2;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import ro.telacad.j4c1e2.beans.Cerc;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String [] args) {
        FileSystemXmlApplicationContext context 
                = new FileSystemXmlApplicationContext("C:\\Users\\student\\Documents\\NetBeansProjects\\j4c1e2\\src\\main\\java\\ro\\telacad\\j4c1e2\\application-context.xml");
        
        Cerc c1 = context.getBean(Cerc.class);
        
        System.out.println(c1.getRaza());
        System.out.println(c1.getCentru().getX());
        System.out.println(c1.getCentru().getY());
    }
}
