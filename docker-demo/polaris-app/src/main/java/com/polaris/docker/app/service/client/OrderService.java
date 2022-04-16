package com.polaris.docker.app.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "order-svc", url = "http://order-svc:8080")
public interface OrderService {
    @RequestMapping(value = "/order/place/{product}/{quantity}/{price}", method = RequestMethod.GET)
    Integer order(@PathVariable(value = "product") String product,
                 @PathVariable(value = "quantity") Integer quantity,
                 @PathVariable(value = "price") Double price);
}
