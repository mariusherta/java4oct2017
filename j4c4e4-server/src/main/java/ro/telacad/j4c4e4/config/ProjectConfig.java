/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c4e4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import ro.telacad.j4c4e4.service.MyService;

/**
 *
 * @author student
 */
@Configuration
@ComponentScan("ro.telacad.*")
public class ProjectConfig {
    
    @Bean
    public RmiServiceExporter serviceExporter(MyService service) {
        RmiServiceExporter rmi = new RmiServiceExporter();
        
        rmi.setServiceName("myservice");
        rmi.setServiceInterface(MyService.class);
        rmi.setService(service);
        rmi.setRegistryPort(4444);
        
        return rmi;
    }
}
