/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c1e4.beans;

import java.util.List;

/**
 *
 * @author student
 */
public class Carte {
    private List<String> autori;
    
    public Carte(List<String> autori) {
        this.autori = autori;
    }

    public List<String> getAutori() {
        return autori;
    }

    public void setAutori(List<String> autori) {
        this.autori = autori;
    }
    
    
}
