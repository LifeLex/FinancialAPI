package com.financialapi.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankOperations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double quantity;
    private String concept;

    public BankOperations(int id, double quantity, String concept) {
        this.id = id;
        this.quantity = quantity;
        this.concept = concept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

}
