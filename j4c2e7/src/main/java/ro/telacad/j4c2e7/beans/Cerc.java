/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c2e7.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 *
 * @author student
 */
@Component
@Lazy
public class Cerc {
    
    @Autowired
    private Punct centru;
    
    public Cerc() {
        System.out.println("Se creaza cercul. Acum centrul este " + centru);
    }
    
    @PostConstruct
    public void init() {
        System.out.println("S-a creat cercul. Acum centru este " + centru);
    }
    
    @PreDestroy
    public void destroy() {
        System.out.println("Se elimina cercul din context");
    }

    public Punct getCentru() {
        return centru;
    }

    public void setCentru(Punct centru) {
        this.centru = centru;
    }
    
    
}
