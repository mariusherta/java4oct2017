/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c4e4.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author student
 */
@Service
public class MyServiceImpl implements MyService {

    @Override
    public String hello(String name) {
        return "Hello, " + name + "!";
    }
    
}
