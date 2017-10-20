/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c2e6.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author student
 */
@Component
public class Matematician {
    
    @Autowired
    @Qualifier("cerc")
    private Forma forma;
    
    public Matematician() {
        
    }
    
    public double calculeaza() {
        return forma.getArie();
    }
}
