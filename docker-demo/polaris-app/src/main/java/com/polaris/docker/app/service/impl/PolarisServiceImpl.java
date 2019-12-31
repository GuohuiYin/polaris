package com.polaris.docker.app.service.impl;

import com.polaris.docker.app.model.PurchaseParameter;
import com.polaris.docker.app.service.PolarisService;
import com.polaris.docker.app.service.client.AuthService;
import com.polaris.docker.app.service.client.OrderService;
import com.polaris.docker.app.service.client.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolarisServiceImpl implements PolarisService {

    @Autowired
    AuthService authService;

    @Autowired
    OrderService orderService;

    @Autowired
    PaymentService paymentService;

    public String purchase(PurchaseParameter purchaseParameter) {
        authService.authenticate(purchaseParameter.getUserId());

        String order = orderService.order(purchaseParameter.getProduct(),
                purchaseParameter.getQuantity(), purchaseParameter.getPrice());

        paymentService.pay(order, purchaseParameter.getPrice());

        String response = "product %s with quantity %s has been purchased for price %s";
        return String.format(response, purchaseParameter.getProduct(),
                purchaseParameter.getQuantity(), purchaseParameter.getPrice());
    }
}
