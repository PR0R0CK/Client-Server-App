package com.pizza.app.service;

import com.pizza.app.domain.dto.CalculateOrderDto;

public interface ReceiptService {
    void makeReceipt(CalculateOrderDto calculateOrderDto);
}
