package com.marketplace.marketplace.repositories;
import com.marketplace.marketplace.models.Product;
import com.marketplace.marketplace.models.enums.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory (Category category);
}
