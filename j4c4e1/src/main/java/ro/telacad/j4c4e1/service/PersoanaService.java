/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c4e1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ro.telacad.j4c4e1.entities.Persoana;
import ro.telacad.j4c4e1.repositories.PersoanaRepository;

/**
 *
 * @author student
 */
@Service
public class PersoanaService {
    
    @Autowired
    private PersoanaRepository persoanaRepo;
    
    @Transactional
    public void adaugaZecePersoane() {
        for (int i = 1; i <= 10 ;i++) {
            Persoana p = new Persoana();
            p.setNume("NUME " + i);
            p.setPrenume("PRENUME " + i);
            persoanaRepo.adaugaPersoana(p);
        }
    }
}
