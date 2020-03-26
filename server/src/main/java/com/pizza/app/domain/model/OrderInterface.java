package com.pizza.app.domain.model;

import com.pizza.app.domain.dto.OrderDto;

import java.util.List;

public interface OrderInterface {
    Integer getTotalOrderPrice();
    int getNumberOfProducts();
    List<OrderDto> getOrderProducts();
}
