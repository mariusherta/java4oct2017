/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c5e2server.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ro.telacad.j4c5e2server.rest.model.Produs;
import ro.telacad.j4c5e2server.rest.model.ProdusRequest;

/**
 *
 * @author student
 */
@RestController
public class ProdusService {
    
    @Autowired
    private RestTemplate restTemplate;
    
    @RequestMapping(method = RequestMethod.POST, path = "/produse")
    public List<Produs> getProduse(@RequestBody ProdusRequest body) {
        List<Produs> produse = new ArrayList<>();
        
        for (int i= 1; i<=10; i++) {
            Produs p = new Produs();
            p.setNume(body.getNume() + " " + i);
            p.setPret(10 * i);
            produse.add(p);
        }
        
        return produse;
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/hello/{nume}")
    public void sayHello(@PathVariable("nume") String nume) {
        System.out.println("Hello, " + nume);
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/showproducts")
    public void getProductsList() {
        String url = "http://localhost:8080/produse";
        
        ProdusRequest body = new ProdusRequest();
        body.setNume("bere");
        
        List<Map<?, ?>> produse = restTemplate.postForObject(url, body, List.class);
        
        produse.forEach(System.out::println);
    }
}
