package com.example.springaopsecurity.module.pruchase;

import org.springframework.stereotype.Service;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Override
    public String processSomething(String input) {
        return "processSomething: " + input;
    }
}
