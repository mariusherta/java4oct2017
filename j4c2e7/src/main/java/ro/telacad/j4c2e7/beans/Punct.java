/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c2e7.beans;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/**
 *
 * @author student
 */
@Component
public class Punct {
    private int x;
    private int y;
    
    public Punct() {
        System.out.println("Punctul a fost creat!");
    }
    
    @PostConstruct
    public void init () {
        System.out.println("Se apeleaza @PostConstruct din Punct");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
