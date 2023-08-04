package com.marketplace.marketplace.controllers;

import com.marketplace.marketplace.models.Product;
import com.marketplace.marketplace.models.enums.Category;
import com.marketplace.marketplace.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<String> createProduct (@RequestBody Product product) {
        return ResponseEntity.ok("Succefully uploaded product !");
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Product>> getAllByCategory (@PathVariable String category) {
        System.out.println(category);
        return ResponseEntity.ok(productService.getAllProcuctsByCategory(Category.fromValue(category)));
    }
    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAllProducts () {
        return ResponseEntity.ok(productService.getAllProducts());
    }
}
