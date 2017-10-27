/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c3e3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ro.telacad.j4c3e3.model.Produs;
import ro.telacad.j4c3e3.repositories.ProdusRepository;

/**
 *
 * @author student
 */
@Service
public class MainService {
    
    @Autowired
    private ProdusRepository produsRepo;
    
    @Transactional
    public void adaugaZeceProduse() {
        try {
            for (int i=1; i<=10; i++) {
                Produs p = new Produs();
                p.setNume("Produs " + i);
                p.setPret(10 * i);
                produsRepo.adaugaProdus(p);
                if (i == 5) throw new RuntimeException();
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
