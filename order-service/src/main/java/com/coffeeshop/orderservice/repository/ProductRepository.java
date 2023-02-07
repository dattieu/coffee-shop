package com.coffeeshop.orderservice.repository;

import com.coffeeshop.orderservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
