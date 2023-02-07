package com.coffeeshop.orderservice.dto;

import lombok.Data;

@Data
public class StoreDto {
    private String phoneNumber;
    private String numberOfQueue;
    private String openingTime;
    private String closingTime;
}
