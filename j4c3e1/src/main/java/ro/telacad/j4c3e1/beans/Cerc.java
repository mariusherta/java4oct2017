/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c3e1.beans;

import org.springframework.stereotype.Component;

/**
 *
 * @author student
 */
@Component
public class Cerc {
    private double raza;

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }
    
    public double getArie() {
        //if (1 == 1) throw new RuntimeException();
        return Math.PI * Math.pow(raza, 2);
    }
}
