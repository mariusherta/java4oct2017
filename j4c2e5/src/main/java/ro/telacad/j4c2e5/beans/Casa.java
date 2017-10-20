/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c2e5.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author student
 */
public class Casa {
    
    @Autowired
    @Qualifier("kitty")
    private Pisica pisica;

    public Pisica getPisica() {
        return pisica;
    }

    public void setPisica(Pisica pisica) {
        this.pisica = pisica;
    }
    
    
}
