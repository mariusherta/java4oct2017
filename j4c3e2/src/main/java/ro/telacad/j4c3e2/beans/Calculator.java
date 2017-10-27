/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c3e2.beans;

import org.springframework.stereotype.Component;

/**
 *
 * @author student
 */
@Component
public class Calculator {
    
    public int suma(int x, int y) {
        return x + y;
    }
}
