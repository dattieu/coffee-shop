package com.coffeeshop.orderservice.service;

import com.coffeeshop.orderservice.entity.Product_menu;
import com.coffeeshop.orderservice.repository.MenuRepository;
import com.coffeeshop.orderservice.repository.ProductMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {
    @Autowired
    MenuRepository menuRepository;

    @Autowired
    ProductMenuRepository productMenuRepository;

    public void addProductToMenu(Long menuId, Long productId ){
        Product_menu pm = new Product_menu(productId, menuId);
        productMenuRepository.save(pm);
    }
}
