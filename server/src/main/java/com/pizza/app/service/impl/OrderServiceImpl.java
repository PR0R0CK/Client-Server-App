package com.pizza.app.service.impl;

import com.pizza.app.domain.dto.CalculateOrderDto;
import com.pizza.app.domain.dto.OrderDto;
import com.pizza.app.domain.dto.ProductDto;
import com.pizza.app.domain.model.OrderInterface;
import com.pizza.app.domain.model.ProductDatabase;
import com.pizza.app.service.OrderService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Service
public class OrderServiceImpl implements OrderService {

    private OrderInterface orderInterface;

    private ProductDatabase productDatabase;

    @Autowired
    public OrderServiceImpl(ProductDatabase productDatabase, OrderInterface orderInterface) {
        this.productDatabase = productDatabase;
        this.orderInterface = orderInterface;
    }

    @Override
    public List<OrderDto> getAllOrders() {
        return orderInterface.getOrderProducts();
    }

    @Override
    public CalculateOrderDto createOrder(OrderDto order) {
        CalculateOrderDto calculateOrderDto = new CalculateOrderDto();

        for (Integer productId : order.getProductIds()) {
            calculateOrderDto.getProducts().add(productDatabase.findProductById(productId));
        }
        if (order.getProductIds().size() > 1){
            calculateOrderDto.getProducts().add(productDatabase.findProductById(10));
        }
        return calculateOrderDto;
    }

    @Override
    public Integer orderPrice(OrderDto orderDto) {
        return orderInterface.getTotalOrderPrice();
    }
}
