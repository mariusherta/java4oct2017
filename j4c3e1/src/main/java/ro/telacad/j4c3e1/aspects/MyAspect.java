/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c3e1.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 * @author student
 */
@Aspect
public class MyAspect {
    
//    @Before("execution(* ro.telacad.j4c3e1.beans.Cerc.getArie(..))")
//    public void before() {
//        System.out.println("Called before getArie()");
//    }
//    
//    @After("execution(* ro.telacad.j4c3e1.beans.Cerc.getArie(..))")
//    public void after() {
//        System.out.println("Called after getArie()");
//    }
//    
//    @AfterReturning("execution(* ro.telacad.j4c3e1.beans.Cerc.getArie(..))")
//    public void afterReturning() {
//        System.out.println("Called after returning getArie()");
//    }
//    
//    @AfterThrowing("execution(* ro.telacad.j4c3e1.beans.Cerc.getArie(..))")
//    public void afterThrowing() {
//        System.out.println("Called after throwing getArie()");
//    }
    
    @Around("execution(* ro.telacad.j4c3e1.beans.Cerc.getArie(..))")
    public Object around1(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("BEFORE CALLING METHOD");
        Object arie = pjp.proceed();
        
        System.out.println("AFTER CALLING METHOD");
        return 10;
    }
}
