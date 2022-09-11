package com.mts.backend.controllers;

import com.mts.backend.entities.SaleEntity;
import com.mts.backend.services.SaleService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping("/sales")
@Builder
@AllArgsConstructor
public class SaleController {

    @Autowired
    SaleService service;

    @GetMapping
    public Page<SaleEntity> findSales(@RequestParam(value = "minDate", defaultValue = "") String minDate,
                                      @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
                                      Pageable pageable) {
        return service.findSales(minDate, maxDate, pageable);
    }
}
