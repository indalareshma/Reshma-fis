package com.example.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.example.userservice.Proxy")
public class ReshmaindalaUserservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(ReshmaindalaUserservice1Application.class, args);
	}

}
