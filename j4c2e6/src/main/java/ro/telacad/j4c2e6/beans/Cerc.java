/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c2e6.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author student
 */
@Component
@Qualifier("cerc")
public class Cerc implements Forma {

    private double raza;
    
    @Override
    public double getArie() {
        return Math.PI * Math.pow(raza, 2);
    }

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }
   
}
