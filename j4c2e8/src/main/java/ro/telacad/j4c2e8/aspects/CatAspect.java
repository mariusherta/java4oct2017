/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c2e8.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author student
 */
@Aspect
public class CatAspect {
    
    @Before("execution(* ro.telacad.j4c2e8.beans.Pisica.sayMiau(..))")
    public void adviceBefore() {
        System.out.println("Aspect executed before!");
    }
    
    @After("execution(* ro.telacad.j4c2e8.beans.Pisica.sayMiau(..))")
    public void adviceAfter() {
        System.out.println("Aspect executed after!");
    }
}
