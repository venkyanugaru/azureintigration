package com.azure.intigration.azureintigration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.azure.intigration.azureintigration.entity.Product;
import com.azure.intigration.azureintigration.service.ProdctService;

import jakarta.websocket.server.PathParam;

@RestController
public class ProdcutController {
    
    @Autowired
    private ProdctService prodctService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> searchProdct(@RequestParam("query") String name){

       return ResponseEntity.ok(prodctService.searcProduct(name));
    }

    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product){

        return prodctService.createProduct(product);

    }
}
