package com.coffeeshop.orderservice.repository;

import com.coffeeshop.orderservice.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
    Store findOneById(Long id);
}
