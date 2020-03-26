package com.pizza.app.controller;


import com.pizza.app.domain.dto.ProductDto;
import com.pizza.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(value = "/api/v1")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @CrossOrigin
    @RequestMapping(value = "/products/pizza/{id}")
    public ProductDto findCustomerByName(@PathVariable("id") Integer id) {
        try {
            return productService.findProductById(id);
        }
        catch (IndexOutOfBoundsException ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "### Product Not Found ###", ex);
        }
    }

    @CrossOrigin
    @RequestMapping(value = "/products/pizza")
    public Iterable<ProductDto> allProducts(){
        return productService.getAllProducts();
    }

    @CrossOrigin
    @RequestMapping(value = "/products/pizza/sets")
    public Iterable<ProductDto> allSets() {
        return productService.getAllSets();
    }

    @CrossOrigin
    @RequestMapping(value = "/products/pizza/news")
    public Iterable<ProductDto> allNewProducts() {
        return productService.getAllNewProducts();
    }

}



