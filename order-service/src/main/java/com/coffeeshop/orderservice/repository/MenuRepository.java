package com.coffeeshop.orderservice.repository;

import com.coffeeshop.orderservice.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    Menu findMenuByStoreId(Long id);
}
