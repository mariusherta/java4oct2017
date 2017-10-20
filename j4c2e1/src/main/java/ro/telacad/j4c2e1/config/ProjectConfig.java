/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c2e1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.telacad.j4c2e1.beans.Cerc;
import ro.telacad.j4c2e1.beans.Punct;

/**
 *
 * @author student
 */
@Configuration
public class ProjectConfig {
    
    @Bean("primul")
    public Punct punct1() {
        Punct p = new Punct();
        p.setX(10);
        p.setY(20);
        return p;
    }
    
    @Bean
    public Punct punct2() {
        Punct p = new Punct();
        p.setX(20);
        p.setY(30);
        return p;
    }
    
    @Bean
    public Cerc cerc(Punct punct2) {
        Cerc c = new Cerc();
        c.setCentru(punct2);
        return c;
    }
}
