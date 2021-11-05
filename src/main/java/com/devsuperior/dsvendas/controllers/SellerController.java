package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dto.SellerDto;
import com.devsuperior.dsvendas.services.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sellers")
public class SellerController {

    private final SellerService sellerService;

    @GetMapping
    public ResponseEntity<List<SellerDto>> findAll() {
        return ResponseEntity.ok(sellerService.findAll());
    }

}
