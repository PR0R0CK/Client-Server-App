package com.pizza.app.controller;

import com.pizza.app.domain.dto.CalculateOrderDto;
import com.pizza.app.domain.dto.OrderDto;
import com.pizza.app.service.OrderService;
import com.pizza.app.service.ReceiptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1")
public class OrderController {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

    private final OrderService orderService;
    private final ReceiptService receiptService;
    public OrderController(OrderService orderService, ReceiptService receiptService) {
        this.orderService = orderService;
        this.receiptService = receiptService;
    }

    @CrossOrigin
    @PostMapping(value = "/order")
    public ResponseEntity<CalculateOrderDto> createOrder(@RequestBody OrderDto orderDto){
        LOGGER.info("########## {}",orderDto);

        CalculateOrderDto calculateOrderDto = orderService.createOrder(orderDto);
        receiptService.makeReceipt(calculateOrderDto);

        LOGGER.info("### Order has been created ###", orderDto.toString());
//        if (orderService.createOrder(orderDto)) {
//            return new ResponseEntity<>(HttpStatus.OK);
//        }else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
        return new ResponseEntity<>(calculateOrderDto,HttpStatus.CREATED);
    }
}
