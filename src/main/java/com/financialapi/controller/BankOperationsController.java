package com.financialapi.controller;

import com.financialapi.entity.BankOperations;
import com.financialapi.service.BankOperationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BankOperationsController {
    @Autowired
    private BankOperationsService service;

    @PostMapping("/addOperation")
    public BankOperations addOperation(@RequestBody BankOperations operation){
        return service.saveOperation(operation);
    }

    @GetMapping("/getOperations")
    public List<BankOperations> getOperations(){
        return service.getOperations();
    }
}
