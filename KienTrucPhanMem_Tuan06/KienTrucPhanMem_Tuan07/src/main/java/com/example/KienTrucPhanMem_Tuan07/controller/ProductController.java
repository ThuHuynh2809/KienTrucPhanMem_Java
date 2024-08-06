/*
 * @ (#) ProductController.java     1.0     3/24/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */
package com.example.KienTrucPhanMem_Tuan07.controller;

import com.example.KienTrucPhanMem_Tuan07.model.Product;
import com.example.KienTrucPhanMem_Tuan07.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ProductController {
    private final ProductRepository productRepository;

    @GetMapping("/getProduct")
    public ResponseEntity<List<Product>> getAllProduct(){
        return ResponseEntity.ok(productRepository.findAll());
    }

    @GetMapping("/getProduct/{id}")
    public ResponseEntity<Product> getProductById(long id){
        return ResponseEntity.ok(productRepository.findById(id).orElse(null));
    }
    @GetMapping("/addProduct")
    public ResponseEntity<Product> addProduct(Product product){
        return ResponseEntity.ok(productRepository.save(product));
    }

}
