package com.pizza.app.domain.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pizza.app.domain.model.ProductDatabase;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class OrderDto implements Serializable {
    @NotEmpty
    @NotNull
    List<Integer> productIds;
}
