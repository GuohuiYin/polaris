package com.polaris.docker.order.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "/order", tags = "Order related interfaces")
@RestController
@RequestMapping(value = "/order")
public class OrderController {
    Logger logger = LoggerFactory.getLogger(OrderController.class);

    @ApiOperation(value = "order process for specified product")
    @GetMapping(value = "/place/{product}/{quantity}/{price}")
    public String order(@PathVariable String product,
                        @PathVariable Integer quantity,
                        @PathVariable Double price) {
        logger.info("order process");

        String response = "order for product %s got placed with quantity %s for price %s";
        return String.format(response, product, quantity, price);
    }
}
