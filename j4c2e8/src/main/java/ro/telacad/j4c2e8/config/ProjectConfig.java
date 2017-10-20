/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c2e8.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ro.telacad.j4c2e8.aspects.CatAspect;

/**
 *
 * @author student
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("ro.telacad.*")
public class ProjectConfig {
    
    @Bean
    public CatAspect aspect() {
        return new CatAspect();
    }
}
