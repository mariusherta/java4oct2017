/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c4e2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ro.telacad.j4c4e2.Main;
import ro.telacad.j4c4e2.entities.Produs;
import ro.telacad.j4c4e2.repositories.ProdusRepository;

/**
 *
 * @author student
 */
@Service
@Transactional
public class ProdusService {
    
    @Autowired
    private ProdusRepository produseRepo;
    
    @Autowired
    private ProdusService self;
    
    private ProdusService self() {
        return Main.context.getBean(ProdusService.class);
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void adaugaProdus(Produs p) {
        produseRepo.adaugaProdus(p);
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void adaugaZeceProduse() {
        for (int i=0; i<10;i++) {
            Produs p = new Produs();
            adaugaProdus(p);
        }
        throw new RuntimeException();
    }
}
