/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c7e1.controllers;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ro.telacad.j4c7e1.model.User;

/**
 *
 * @author student
 */
@Controller
public class LoginController {
    
    @RequestMapping(method = RequestMethod.GET, path = "/login")
    public String login() {
        return "login";
    }
    
    @RequestMapping(method = RequestMethod.POST, path = "/login")
    public String login(User user, Map<String,String> map) {
        if ("gigel".equals(user.getUsername()) && 
                "1234".equals(user.getPassword())) {
            map.put("mesaj", "Yaay! You are now logged in!");
        } else {
            map.put("mesaj", "Ntz Ntz Ntz. You missed the login!");
        }
        return "login";
    }
}
