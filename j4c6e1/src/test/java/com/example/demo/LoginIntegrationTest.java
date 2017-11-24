/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author student
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ActiveProfiles(profiles = "unittest")
public class LoginIntegrationTest {
    
    @Value("${server.port}")
    private int port;
    
    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private UserRepository userRepo;
    
    @Test
    public void registrationTest () {
        String url = "http://localhost:" + port + "/register";
        User user = new User();
        user.setUsername("bob");
        user.setPassword("pass");
        
        restTemplate.postForObject(url, user, Void.class);
        
        User userdb = userRepo.findByUsername(user.getUsername());
        
        Assert.assertNotNull(user);
        
        userRepo.delete(userdb);
    }
}
