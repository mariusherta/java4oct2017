/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c7e1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author student
 */
@Controller
public class HelloController {
    
    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String index() {
        return "index";
    }
}
