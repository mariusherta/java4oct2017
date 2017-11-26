package com.example.demo;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.service.LoginService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import static org.mockito.Mockito.times;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(profiles = "unittest")
public class J4c6e1ApplicationTests {

    @MockBean    
    private UserRepository userRepo;
    
    @Autowired
    private LoginService loginService;
    
    @Test
    public void testRegister () {
        User user = new User();
        user.setUsername("user");
        user.setPassword("password");
        
        BDDMockito.given(userRepo.findByUsername(user.getUsername())).willReturn(null);        
        
        loginService.register(user);
        
        Mockito.verify(userRepo, times(1)).save(user);
    }
    
    @Test(expected = RuntimeException.class)
    public void testRegisterUserExists () {
        User user = new User();
        user.setUsername("user");
        user.setPassword("password");
        
        BDDMockito.given(userRepo.findByUsername(user.getUsername())).willReturn(user);        
        
        loginService.register(user);
    }
    
    @Test
    public void testLoginSuccess () {
        User user = new User();
        user.setUsername("user");
        user.setPassword("password");
        
        BDDMockito.given(userRepo.findByUsername(user.getUsername())).willReturn(user);        
        
        boolean result = loginService.login(user);
        
        Mockito.verify(userRepo, times(1)).findByUsername(user.getUsername());
        Assert.assertTrue(result);
    }
}
