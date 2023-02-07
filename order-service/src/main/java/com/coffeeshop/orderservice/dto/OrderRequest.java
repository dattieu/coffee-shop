package com.coffeeshop.orderservice.dto;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
public class OrderRequest {
    @NotNull
    private Long customerId;
    @NotNull
    private Long storeId;

    @NotEmpty
    private List<OrderLineItemDto> orderLineItemDtoList;
}
