package com.polaris.docker.app.service;

import com.polaris.docker.app.model.PurchaseRequest;

public interface PolarisService {
    String purchase(PurchaseRequest purchaseRequest);
}
