/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c4e3.service;

import java.time.LocalDateTime;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 *
 * @author student
 */
@Service
public class MyService {
    
    @Cacheable(key = "#key", cacheNames = "spittleCache")
    public String getSomething(String key) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return "Something " + LocalDateTime.now();
    }
}
