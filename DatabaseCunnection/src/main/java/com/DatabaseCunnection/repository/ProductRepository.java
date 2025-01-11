package com.DatabaseCunnection.repository;

import com.DatabaseCunnection.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
}
