package com.example.springaopsecurity.system.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class ObservationAspect {
    @Before("execution(*  com.example.springaopsecurity.module..*.* (..))")
    public void coming(JoinPoint joinPoint) {
        System.out.println("Observation aspect");
        }
    }


