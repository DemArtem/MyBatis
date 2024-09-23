package org.itstep.controllers;

import org.itstep.domain.Product;
import org.itstep.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    private List<Product> findAll(){
        return productRepository.findAll();
    }

}