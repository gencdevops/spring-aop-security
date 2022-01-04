package com.example.springaopsecurity.system.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class InterventionAspect {
    @Before("execution(* com.example.springaopsecurity.module.service.*.* (..))")
    public void comingAll(JoinPoint joinPoint) {
      String input = (String) joinPoint.getArgs()[0];

      if(input != null && input.equals("danger")) {
          throw new IllegalArgumentException("Bu deger kabul edilemez > "  + input);
      }
    }
}
