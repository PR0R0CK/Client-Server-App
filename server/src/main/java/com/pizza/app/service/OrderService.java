package com.pizza.app.service;

import com.pizza.app.domain.dto.CalculateOrderDto;
import com.pizza.app.domain.dto.OrderDto;

import java.util.List;

public interface OrderService {
    List<OrderDto> getAllOrders();
    CalculateOrderDto createOrder(OrderDto order);
    Integer orderPrice(OrderDto orderDto);
}
