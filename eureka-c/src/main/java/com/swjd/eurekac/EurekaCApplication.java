package com.swjd.eurekac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaCApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCApplication.class, args);
    }

}
