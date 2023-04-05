package com.vgipl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WeighBridgeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeighBridgeServiceApplication.class, args);
	}

}
