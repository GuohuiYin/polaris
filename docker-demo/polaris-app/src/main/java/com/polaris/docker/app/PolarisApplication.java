package com.polaris.docker.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PolarisApplication {
    public static void main(String[] args) {
        SpringApplication.run(PolarisApplication.class, args);
    }
}
