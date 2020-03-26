package com.pizza.app.domain.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CalculateOrderDto {
    List<ProductDto> products = new ArrayList<>();
    Integer totalPrice = 0;
    String pdfPath = "/files/PARAGON.pdf";


    public Integer getTotalPrice() {
        Integer price = products.stream().map(ProductDto::getPrice).reduce(0, Integer::sum);
        if (products.get(products.size()-1).getType() == "drink") {
            price -= products.get(products.size()-1).getPrice();
        }

        if (price >= 10000) {
            price *= 8;
            price /= 10;
        }
        return price;
    }

    public List<ProductDto> getProducts() {
        return products;
    }
    public String stringPrice() {
        return "\nSuma  PLN: " + getTotalPrice()/100;
    }
}
