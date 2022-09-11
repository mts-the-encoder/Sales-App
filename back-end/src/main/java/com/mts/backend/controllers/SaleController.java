package com.mts.backend.controllers;

import com.mts.backend.entities.SaleEntity;
import com.mts.backend.repositories.SaleRepository;
import com.mts.backend.services.SaleService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
@Builder
@AllArgsConstructor
public class SaleController {

    @Autowired
    SaleService service;

    @GetMapping
    public List<SaleEntity> findSales() {
        return service.findSales();
    }
}
