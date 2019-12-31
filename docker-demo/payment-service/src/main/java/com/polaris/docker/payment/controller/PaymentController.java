package com.polaris.docker.payment.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "/payment", description = "Payment related interfaces")
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
    Logger logger = LoggerFactory.getLogger(PaymentController.class);

    @ApiOperation(value = "pay process for specified order with specified price")
    @GetMapping(value = "/pay/{order}/{price}")
    public String pay(@PathVariable String order,
                      @PathVariable Double price) {
        logger.info("payment process");

        String response = "order %s got paid with price %s";
        return String.format(response, order, price);
    }
}
