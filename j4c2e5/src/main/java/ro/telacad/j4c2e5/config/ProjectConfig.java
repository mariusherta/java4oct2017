/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c2e5.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.telacad.j4c2e5.beans.Casa;
import ro.telacad.j4c2e5.beans.Pisica;

/**
 *
 * @author student
 */
@Configuration
public class ProjectConfig {
    
    @Bean
    @Qualifier("mitzy")
    public Pisica pisica1() {
        Pisica p = new Pisica();
        p.setNume("Mitzy");
        return p;
    }
    
    @Bean
    @Qualifier("kitty")
    public Pisica pisica2() {
        Pisica p = new Pisica();
        p.setNume("Kitty");
        return p;
    }
    
    @Bean
    public Casa casa() {
        return new Casa();
    }
    
}
