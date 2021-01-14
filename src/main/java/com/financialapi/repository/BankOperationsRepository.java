package com.financialapi.repository;

import com.financialapi.entity.BankOperations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankOperationsRepository extends JpaRepository<BankOperations, Integer> {


}
