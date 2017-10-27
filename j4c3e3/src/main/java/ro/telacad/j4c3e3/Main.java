/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c3e3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.telacad.j4c3e3.config.ProjectConfig;
import ro.telacad.j4c3e3.services.MainService;

/**
 *
 * @author student
 */
public class Main {
 
    public static void main(String [] args) {
        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            MainService service = context.getBean(MainService.class);
            service.adaugaZeceProduse();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
