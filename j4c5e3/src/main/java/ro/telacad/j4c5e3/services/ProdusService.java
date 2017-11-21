/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c5e3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.telacad.j4c5e3.entities.Produs;
import ro.telacad.j4c5e3.repositories.ProdusRepository;

/**
 *
 * @author student
 */
@RestController
public class ProdusService {
    
    @Autowired
    private ProdusRepository produsRepo;
    
    @RequestMapping(method = RequestMethod.POST, path = "/produse/create")
    public void adaugaProdus(@RequestBody Produs p) {
        produsRepo.save(p);
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/find/{id}")
    public Produs findProdus(@PathVariable("id") Integer id) {
        return produsRepo.findOne(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/get/{id}")
    public void getProdus(@PathVariable("id") Integer id) {
        Produs p = produsRepo.getOne(id);
        System.out.println(p.getId() + " " + p.getNume() + " " + p.getPret());
    }
}
