package com.example.springaopsecurity.module.serviceimpl;

import com.example.springaopsecurity.module.service.SalesService;
import org.springframework.stereotype.Service;

@Service
public class SalesServiceImpl implements SalesService  {
    @Override
    public String performSomething(String input) {
      return "Perform Something : " + input;
    }

    @Override
    public String performAnother(String input) {
        return "Perform Another : " + input;
    }

    @Override
    public String handleSomething(String input) {
        return "Handle Something : " + input;
    }
}
