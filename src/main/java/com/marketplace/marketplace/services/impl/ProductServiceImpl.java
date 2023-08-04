package com.marketplace.marketplace.services.impl;
import com.marketplace.marketplace.models.Product;
import com.marketplace.marketplace.models.enums.Category;
import com.marketplace.marketplace.repositories.ProductRepository;
import com.marketplace.marketplace.services.ProductService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProcuctsByCategory(Category category) {
        return productRepository.findByCategory(category);
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
