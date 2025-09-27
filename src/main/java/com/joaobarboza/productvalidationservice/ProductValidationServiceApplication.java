package com.joaobarboza.productvalidationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.joaobarboza.productvalidationservice")
public class ProductValidationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductValidationServiceApplication.class, args);
    }

}
