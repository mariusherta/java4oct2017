/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c3e2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ro.telacad.j4c3e2.aspects.MyAspect;

/**
 *
 * @author student
 */
@Configuration
@ComponentScan("ro.telacad.*")
@EnableAspectJAutoProxy
public class ProjectConfig {
    
    @Bean
    public MyAspect aspect() {
        return new MyAspect();
    }
}
