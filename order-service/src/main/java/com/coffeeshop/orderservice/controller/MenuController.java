package com.coffeeshop.orderservice.controller;

import com.coffeeshop.orderservice.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/menus")
public class MenuController {
    @Autowired
    MenuService menuService;

    @PostMapping("/{menuId}")
    public void addProductToMenu(@PathVariable Long menuId, Long productId){
        menuService.addProductToMenu(menuId, productId);
    }
}
