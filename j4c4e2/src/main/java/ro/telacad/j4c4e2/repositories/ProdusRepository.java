/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c4e2.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ro.telacad.j4c4e2.entities.Produs;

/**
 *
 * @author student
 */
@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class ProdusRepository {
    
    @PersistenceContext
    private EntityManager em;
    
    @Transactional(propagation = Propagation.REQUIRES_NEW, noRollbackFor = RuntimeException.class)
    public void adaugaProdusCuExceptie(Produs p) {
        em.persist(p);
        throw new RuntimeException("XYZ");
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void adaugaProdus(Produs p) {
        em.persist(p);
    }
}
