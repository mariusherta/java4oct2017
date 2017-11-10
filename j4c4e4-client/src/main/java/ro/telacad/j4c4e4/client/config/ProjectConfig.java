/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c4e4.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import ro.telacad.j4c4e4.service.MyService;

/**
 *
 * @author student
 */
@Configuration
public class ProjectConfig {
    
    @Bean
    public RmiProxyFactoryBean rmiProxy() {
        RmiProxyFactoryBean rmi = new RmiProxyFactoryBean();
        
        rmi.setServiceUrl("rmi://localhost:4444/myservice");
        rmi.setServiceInterface(MyService.class);
        
        return rmi;
    }
}
