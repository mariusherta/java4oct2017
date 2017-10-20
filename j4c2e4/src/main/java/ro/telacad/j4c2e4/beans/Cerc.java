/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c2e4.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author student
 */
@Component
public class Cerc {
    
    @Autowired
    private Punct centru;

    public Punct getCentru() {
        return centru;
    }

    public void setCentru(Punct centru) {
        this.centru = centru;
    }
    
    
}
