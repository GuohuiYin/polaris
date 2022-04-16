package com.polaris.docker.app.service.impl;

import com.polaris.docker.app.model.PurchaseRequest;
import com.polaris.docker.app.service.PolarisService;
import com.polaris.docker.app.service.client.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolarisServiceImpl implements PolarisService {

    @Autowired
    OrderService orderService;

    public String purchase(PurchaseRequest purchaseRequest) {
        Integer order = orderService.order(purchaseRequest.getProduct(),
                purchaseRequest.getQuantity(), purchaseRequest.getPrice());

        String response = "product [%s] with quantity [%s] has been ordered for price [%s], order id [%s]";
        return String.format(response, purchaseRequest.getProduct(),
                purchaseRequest.getQuantity(), purchaseRequest.getPrice(), order);
    }
}
