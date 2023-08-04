package com.marketplace.marketplace.services;
import com.marketplace.marketplace.models.Product;
import com.marketplace.marketplace.models.enums.Category;

import java.util.List;

public interface ProductService {
    List<Product> getAllProcuctsByCategory(Category category);

    Product addProduct(Product product);
    List<Product> getAllProducts();
}
