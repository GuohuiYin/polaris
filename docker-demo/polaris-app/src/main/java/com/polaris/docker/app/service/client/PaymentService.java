package com.polaris.docker.app.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("payment-svc")
public interface PaymentService {

    @RequestMapping(value = "/payment/pay/{order}/{price}", method = RequestMethod.GET)
    String pay(@PathVariable(value = "order") String order,
               @PathVariable(value = "price") Double price);
}
