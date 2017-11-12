/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c4e1.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ro.telacad.j4c4e1.entities.Persoana;

/**
 *
 * @author student
 */
@Repository
public class JpaPersoanaRepository implements PersoanaRepository {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void adaugaPersoana(Persoana p) {
         em.persist(p);
    }
    
}
