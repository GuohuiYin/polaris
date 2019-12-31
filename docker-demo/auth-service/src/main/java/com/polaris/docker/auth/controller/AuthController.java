package com.polaris.docker.auth.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "/auth", description = "Authentication and authorization related interfaces")
@RestController
@RequestMapping(value = "/auth")
public class AuthController {
    Logger logger = LoggerFactory.getLogger(AuthController.class);

    @ApiOperation(value = "user authentication process")
    @PostMapping(value = "/authenticate")
    public String authenticate(String userId) {
        logger.info("authentication process");

        String response = "user %s has been authenticated";
        return String.format(response, userId);
    }
}
