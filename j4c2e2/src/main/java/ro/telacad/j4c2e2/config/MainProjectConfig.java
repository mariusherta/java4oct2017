/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c2e2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 *
 * @author student
 */
@Configuration
@Import(OtherProjectConfig.class)
@ImportResource("file:C:\\Users\\student\\Documents\\NetBeansProjects\\j4c2e2\\src\\main\\java\\ro\\telacad\\j4c2e2\\application-config.xml")
public class MainProjectConfig {
    
}
