package com.coffeeshop.orderservice.dto;

import lombok.Data;

@Data
public class ProductRequest {
    private String name;
    private Double price;
}
