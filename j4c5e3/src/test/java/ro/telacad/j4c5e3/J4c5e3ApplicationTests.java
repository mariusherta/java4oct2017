package ro.telacad.j4c5e3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.ExpectedCount;
import ro.telacad.j4c5e3.entities.Produs;
import ro.telacad.j4c5e3.repositories.ProdusRepository;
import ro.telacad.j4c5e3.services.ProdusService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class J4c5e3ApplicationTests {
    
    @MockBean
    private ProdusRepository produsRepo;
    
    @Autowired
    private ProdusService produsService;

    @Test
    public void contextLoads() {
        Assert.assertNotNull(produsRepo);
        Assert.assertNotNull(produsService);
    }
    
    @Test
    public void addProdusTest() {
        Produs p = new Produs();
        produsService.adaugaProdus(p);
        
        Mockito.verify(produsRepo, Mockito.times(1)).save(p);
    }

}
