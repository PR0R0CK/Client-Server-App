package com.pizza.app.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.pizza.app.domain.dto.OrderDto;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Component
public class Order implements OrderInterface {
    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate dateCreated;
    List<OrderDto> orderProducts = new ArrayList<>();

    @Override
    public Integer getTotalOrderPrice() {
        int sum = 0;
        List<OrderDto> orderProducts = getOrderProducts();
        for (OrderDto orderDto : orderProducts) {
            sum += 2;
        }
        return sum;
    }

    @Override
    public int getNumberOfProducts() {
        return this.orderProducts.size();
    }
}
