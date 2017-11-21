/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c5e3;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import ro.telacad.j4c5e3.entities.Produs;
import ro.telacad.j4c5e3.repositories.ProdusRepository;

/**
 *
 * @author student
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ProdusServiceIntegrationTests {
    
    @Value("${server.port}")
    private int port;
    
    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private ProdusRepository produsRepo;
    
    @Test
    public void createProdusTest() {
        String url = "http://localhost:"+port+"/produse/create";
        Produs p = new Produs();
        p.setNume("produs test");
        p.setPret(10);
        
        restTemplate.postForObject(url, p, Void.class);
        
        List<Produs> produse = produsRepo.findProdusByName(p.getNume());
    
        Assert.assertNotNull(produse);
        Assert.assertFalse(produse.isEmpty());
        
        produse.forEach(produsRepo::delete);
    }
}
