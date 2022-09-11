package com.mts.backend.services;

import com.mts.backend.entities.SaleEntity;
import com.mts.backend.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<SaleEntity> findSales() {
        return repository.findAll();
    }
}
