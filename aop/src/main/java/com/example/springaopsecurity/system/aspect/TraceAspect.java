package com.example.springaopsecurity.system.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;



@Aspect
@Configuration
public class TraceAspect {

    @Before("execution(* com.example.springaopsecurity.module.service.*.* (..))")
    public void comingAll(JoinPoint joinPoint) {
        System.out.println("before execution comingAll");
        System.out.println("joinPointToString: " + joinPoint.toString());

    }

    @Before("execution(* com.example.springaopsecurity.module.service.Sales*.*Something (String))")
    public void comingSomething(JoinPoint joinPoint) {
        System.out.println("before execution comingSomething");
    }

    @Before("execution(* com.example.springaopsecurity.module.service.*.handle* (String))")
    public void comingHandle(JoinPoint joinPoint) {
        System.out.println("before execution comingHandle");
    }

    @Around("execution(* com.example.springaopsecurity.module.service.*.* (..))")
    public Object doingAll(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around execution doingAll");
        return  proceedingJoinPoint.proceed();
    }

    @After("execution(* com.example.springaopsecurity.module.service.*.* (..))")
    public void goingAll(JoinPoint joinPoint) {
        System.out.println("after execution goingAll");
    }

}
