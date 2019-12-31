package com.polaris.docker.app.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("auth-svc")
public interface AuthService {
    @RequestMapping(value = "/auth/authenticate", method = RequestMethod.POST)
    public String authenticate(String userId);
}
