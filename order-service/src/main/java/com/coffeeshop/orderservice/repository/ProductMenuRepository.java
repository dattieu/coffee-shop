package com.coffeeshop.orderservice.repository;

import com.coffeeshop.orderservice.entity.Product_menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductMenuRepository extends JpaRepository<Product_menu, Long> {
}
