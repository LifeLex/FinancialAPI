package com.financialapi.service;

import com.financialapi.entity.BankOperations;
import com.financialapi.repository.BankOperationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankOperationsService {

    @Autowired
    private BankOperationsRepository repository;

    public BankOperations saveOperation(BankOperations operation){
        return repository.save(operation);
    }

    public List<BankOperations> getOperations(){
        return repository.findAll();
    }




}
