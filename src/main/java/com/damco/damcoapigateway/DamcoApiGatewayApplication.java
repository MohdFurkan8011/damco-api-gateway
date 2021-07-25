package com.damco.damcoapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DamcoApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DamcoApiGatewayApplication.class, args);
	}

}
