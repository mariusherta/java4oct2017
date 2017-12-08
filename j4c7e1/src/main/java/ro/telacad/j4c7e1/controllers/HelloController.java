/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c7e1.controllers;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author student
 */
@Controller
public class HelloController {
    
    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String index(Map<String,String> map) {
        map.put("nume", "John");
        return "index";
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/main")
    public String main(
            @RequestParam("nume") String nume,
            Map<String,String> map) {
        map.put("nume", nume);
        return "main";
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/produs/{produs}")
    public String produs(
            @PathVariable("produs") String produs,
            Map<String,String> map) {
        map.put("produs", produs);
        return "produs";
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String hello() {
        return "nume";
    }
    
    @RequestMapping(method = RequestMethod.POST, path = "/hello")
    public String hello(String nume,
            Map<String,String> map) {
        map.put("mesaj", "Hello, " + nume + "!");
        return "nume";
    }
}
