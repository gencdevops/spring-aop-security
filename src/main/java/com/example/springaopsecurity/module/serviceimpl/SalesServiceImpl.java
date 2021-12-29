package com.example.springaopsecurity.module.serviceimpl;

import com.example.springaopsecurity.module.service.SalesService;
import org.springframework.stereotype.Service;

@Service
public class SalesServiceImpl implements SalesService  {
    @Override
    public String performSomething(String input) {
        String output = "Satis yapiliyor : " + input;
        return output;
    }
}
