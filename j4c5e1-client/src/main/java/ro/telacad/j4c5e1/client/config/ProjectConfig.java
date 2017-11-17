/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c5e1.client.config;

import java.net.MalformedURLException;
import java.net.URL;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;
import ro.telacad.j4c5e1.services.MyService;

/**
 *
 * @author student
 */

@Configuration
public class ProjectConfig {
    
    @Bean
    public JaxWsPortProxyFactoryBean proxy() {
        JaxWsPortProxyFactoryBean proxy = new JaxWsPortProxyFactoryBean();
        
        try {
            proxy.setWsdlDocumentUrl(new URL("http://localhost:8080/myservice?wsdl"));
        
            proxy.setServiceName("MyServiceService");
            proxy.setPortName("MyServicePort");
            proxy.setServiceInterface(MyService.class);
            proxy.setNamespaceUri("http://services.j4c5e1.telacad.ro/");
        
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        
        return proxy;
    }
}
