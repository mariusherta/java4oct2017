/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c3e2.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 *
 * @author student
 */
@Aspect
public class MyAspect {
    
    @Around("execution(* ro.telacad.j4c3e2.beans.Calculator.suma(..))")
    public Object suma(ProceedingJoinPoint pjp) {
        Object x = pjp.getArgs()[0];
        Object y = pjp.getArgs()[1];
        
        return ((int) x) * ((int) y);
    }
}
