/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c3e3.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ro.telacad.j4c3e3.model.Produs;

/**
 *
 * @author student
 */
@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class ProdusRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public void adaugaProdus(Produs p) {
        String sql = "INSERT INTO produse VALUES (NULL,?,?)";
        jdbcTemplate.update(sql, p.getNume(), p.getPret());
    }
}
