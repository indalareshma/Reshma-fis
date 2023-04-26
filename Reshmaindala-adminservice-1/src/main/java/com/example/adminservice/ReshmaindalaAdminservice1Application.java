package com.example.adminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.example.adminservice.proxy")
public class ReshmaindalaAdminservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(ReshmaindalaAdminservice1Application.class, args);
	}

}
