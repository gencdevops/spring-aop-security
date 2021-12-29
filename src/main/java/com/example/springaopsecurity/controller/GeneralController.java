package com.example.springaopsecurity.controller;

import com.example.springaopsecurity.module.service.SalesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GeneralController {

    private final SalesService salesService;


    public GeneralController(SalesService salesService) {
        this.salesService = salesService;
    }

    @GetMapping("/aop/sales/{in}")
    @ResponseBody
    public String getSales(@PathVariable("in") String input) {
    String output = "Denetleyici > " + salesService.performSomething(input);

    return output;
    }

}
