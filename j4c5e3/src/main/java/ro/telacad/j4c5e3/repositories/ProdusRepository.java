/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c5e3.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ro.telacad.j4c5e3.entities.Produs;

/**
 *
 * @author student
 */
public interface ProdusRepository extends JpaRepository<Produs, Integer>{
    
    @Query("SELECT p FROM Produs p WHERE p.nume = :nume")
    public List<Produs> findProdusByName(@Param("nume") String name);
}
