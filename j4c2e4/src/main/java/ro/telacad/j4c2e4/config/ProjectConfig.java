/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c2e4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import ro.telacad.j4c2e4.beans.Punct;

/**
 *
 * @author student
 */
@Configuration
@ComponentScan("ro.telacad.*")
public class ProjectConfig {
    
    @Bean
    public Punct punct1() {
        Punct p = new Punct();
        p.setX(10);
        p.setY(20);
        return p;
    }
    
    @Bean
    @Primary
    public Punct punct2() {
        Punct p = new Punct();
        p.setX(30);
        p.setY(40);
        return p;
    }
    
}
