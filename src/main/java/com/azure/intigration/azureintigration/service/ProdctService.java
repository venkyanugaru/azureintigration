package com.azure.intigration.azureintigration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azure.intigration.azureintigration.entity.Product;
import com.azure.intigration.azureintigration.repository.ProductRepository;
@Service
public class ProdctService {
    
    @Autowired
    private ProductRepository productRepository;

    public  List<Product> searcProduct(String query){
       return productRepository.searcProductbyNativeQuery(query);
    }

    public Product createProduct(Product product) {
       return productRepository.save(product);
    }

}
