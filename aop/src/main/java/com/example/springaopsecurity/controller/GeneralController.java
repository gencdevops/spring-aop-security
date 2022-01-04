package com.example.springaopsecurity.controller;

import com.example.springaopsecurity.module.pruchase.PurchaseService;
import com.example.springaopsecurity.module.service.SalesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GeneralController {

    private final SalesService salesService;
    private final PurchaseService purchaseService;

    public GeneralController(SalesService salesService, PurchaseService purchaseService) {
        this.salesService = salesService;
        this.purchaseService = purchaseService;
    }

    @GetMapping("/aop/something/{in}")
    @ResponseBody
    public String getSomething(@PathVariable("in") String input) {
    return "Denetleyici > " + salesService.performSomething(input);

    }

    @GetMapping("/aop/another/{in}")
    @ResponseBody
    public String getAnother(@PathVariable("in") String input) {
        return "Denetleyici > " + salesService.performAnother(input);
    }

    @GetMapping("/aop/handle/{in}")
    @ResponseBody
    public String getHandle(@PathVariable("in") String input) {
       return  "Denetleyici > " + salesService.handleSomething(input);
    }

    @GetMapping("/aop/purchase/{in}")
    @ResponseBody
    public String getPurchase(@PathVariable("in") String input) {
        return  "Denetleyici > " + purchaseService.processSomething(input);
    }
}
