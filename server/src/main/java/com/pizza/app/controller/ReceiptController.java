package com.pizza.app.controller;

import com.pizza.app.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/receipt")
public class ReceiptController {
    private final ReceiptService receiptService;

    @Autowired
    public ReceiptController(ReceiptService receiptService) {
        this.receiptService = receiptService;
    }
//    @CrossOrigin
//    @RequestMapping()
//    public void makeReceipt(){
//        receiptService.makeReceipt();
//    }
}
