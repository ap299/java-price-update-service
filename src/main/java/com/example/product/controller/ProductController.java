package com.example.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.product.model.Product;
import com.example.product.service.ProductService;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PutMapping("/{productId}/price")
    public ResponseEntity<Product> updateProductPrice(@PathVariable String productId, @RequestParam double newPrice) {
        Optional<Product> updatedProduct = productService.updateProductPrice(productId, newPrice);
        return updatedProduct
                .map(product -> new ResponseEntity<>(product, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}