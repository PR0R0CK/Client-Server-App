package com.pizza.app.service.impl;

import com.pizza.app.domain.dto.ProductDto;
import com.pizza.app.domain.model.ProductDatabase;
import com.pizza.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    final
    ProductDatabase productDatabase;

    @Autowired
    public ProductServiceImpl(ProductDatabase productDatabase) {
        this.productDatabase = productDatabase;
    }

    @Override
    public ProductDto findProductById(Integer id) {
        return productDatabase.findProductById(id);
    }

    @Override
    public Iterable<ProductDto> getAllProducts() {
        return productDatabase.getAllProducts();
    }

    @Override
    public  Iterable<ProductDto> getAllHalfPizzas() {
        return productDatabase.getHalfPizza();
    }

    @Override
    public Iterable<ProductDto> getAllSets(){return productDatabase.getSets();}

    @Override
    public Iterable<ProductDto> getAllNewProducts() {
        return productDatabase.getNewProduct();
    }
}
