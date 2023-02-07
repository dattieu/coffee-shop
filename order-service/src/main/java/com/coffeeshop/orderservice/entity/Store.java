package com.coffeeshop.orderservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private String phoneNumber;
    private String numberOfQueue;
    private String openingTime;
    private String closingTime;

    public Store(String name, String location, String phoneNumber, String numberOfQueue, String openingTime, String closingTime) {
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.numberOfQueue = numberOfQueue;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }
}
