package com.coffeeshop.orderservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;

    private Long storeId;

    private Double total;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderLineItem> orderLineItemList;

    public Order(Long customerId, Long storeId, Double total, List<OrderLineItem> orderLineItemList) {
        this.customerId = customerId;
        this.storeId = storeId;
        this.total = total;
        this.orderLineItemList = orderLineItemList;
    }
}
