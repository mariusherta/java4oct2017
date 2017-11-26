/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginService {

    @Autowired
    public UserRepository userRepository;

    @RequestMapping(method = RequestMethod.POST, path = "/register")
    public void register(@RequestBody User user) {
        User userDatabase = userRepository.findByUsername(user.getUsername());
        if (userDatabase == null) {
            userRepository.save(user);
        } else {
            throw new RuntimeException("User existent!");
        }
    }

    public boolean login(User user) {
        User userdb = userRepository.findByUsername(user.getUsername());
        if (userdb != null) {
            if (userdb.getPassword().equals(user.getPassword())){
                return true;
            }
        } 
        
        return false;
        
    }
}
