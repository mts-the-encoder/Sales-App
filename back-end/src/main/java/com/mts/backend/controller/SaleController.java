package com.mts.backend.controller;

import com.mts.backend.entities.SaleEntity;
import com.mts.backend.repository.SaleRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Builder
@AllArgsConstructor
@RestController
@RequestMapping("sales")
public class SaleController {

    private final SaleRepository saleRepository;

    @GetMapping
    public ResponseEntity<List<SaleEntity>> getAllSalesMongo() {
        return ResponseEntity.ok(this.saleRepository.findAll());
    }

}
