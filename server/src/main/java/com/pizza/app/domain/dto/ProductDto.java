package com.pizza.app.domain.dto;


import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductDto {
    String type;
    Integer id;
    String name;
    Integer size;
    Integer price;
    String img;
    String desc;
}


