package com.polaris.docker.app.controller;

import com.polaris.docker.app.model.PurchaseRequest;
import com.polaris.docker.app.service.PolarisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "/polaris", tags = "Application interfaces")
@RestController
@RequestMapping(value = "/polaris")
public class PolarisController {

    @Autowired
    PolarisService polarisService;

    @ApiOperation(value = "purchase specified product")
    @PostMapping(value = "/purchase")
    public String purchase(@RequestBody PurchaseRequest purchaseRequest) {
        return polarisService.purchase(purchaseRequest);
    }
}
