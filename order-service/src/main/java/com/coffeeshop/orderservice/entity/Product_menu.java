package com.coffeeshop.orderservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "menu_product")
@AllArgsConstructor
@NoArgsConstructor
public class Product_menu {
    @Id
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "menu_id")
    private Long menuId;
}
