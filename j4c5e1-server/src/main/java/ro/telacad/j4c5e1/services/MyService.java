/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c5e1.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.springframework.stereotype.Service;

/**
 *
 * @author student
 */
@Service
@WebService
public class MyService {
    
    @WebMethod
    public String sayHello(@WebParam(name = "nume") String nume) {
        return "Hello, " + nume + "!";
    }
}
