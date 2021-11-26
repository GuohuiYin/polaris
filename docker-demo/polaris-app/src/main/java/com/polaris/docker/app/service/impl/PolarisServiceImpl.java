package com.polaris.docker.app.service.impl;

import com.polaris.docker.app.model.PurchaseParameter;
import com.polaris.docker.app.service.PolarisService;
import com.polaris.docker.app.service.client.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolarisServiceImpl implements PolarisService {

    @Autowired
    OrderService orderService;

    public String purchase(PurchaseParameter purchaseParameter) {
        if ("1000".equals(purchaseParameter.getUserId())) {
            throw new UnsupportedOperationException("user cannot be supported");
        }
        String order = orderService.order(purchaseParameter.getProduct(),
                purchaseParameter.getQuantity(), purchaseParameter.getPrice());

        String response = "product [%s] with quantity [%s] has been ordered for price [%s], order id [%s]";
        return String.format(response, purchaseParameter.getProduct(),
                purchaseParameter.getQuantity(), purchaseParameter.getPrice(), order);
    }
}
