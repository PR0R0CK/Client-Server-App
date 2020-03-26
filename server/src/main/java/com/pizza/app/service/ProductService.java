package com.pizza.app.service;

import com.pizza.app.domain.dto.ProductDto;

public interface ProductService {
    ProductDto findProductById(Integer id);
    Iterable<ProductDto> getAllProducts();
    Iterable<ProductDto> getAllHalfPizzas();
    Iterable<ProductDto> getAllSets();
    Iterable<ProductDto> getAllNewProducts();
}
