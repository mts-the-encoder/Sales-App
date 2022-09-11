package com.mts.backend.controllers;

import com.mts.backend.entities.SaleEntity;
import com.mts.backend.services.SaleService;
import com.mts.backend.services.SmsService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping("/sales")
@Builder
@AllArgsConstructor
@Data
public class SaleController {

    @Autowired
    private SaleService service;

    @Autowired
    private SmsService smsService;

    @GetMapping
    public Page<SaleEntity> findSales(@RequestParam(value = "minDate", defaultValue = "") String minDate,
                                      @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
                                      Pageable pageable) {
        return service.findSales(minDate, maxDate, pageable);
    }

    @GetMapping("/{id}/notification")
    public void notifySms(@PathVariable Long id) {
        smsService.sendSms(id);
    }
}
