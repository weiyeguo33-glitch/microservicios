package com.mimicroservice.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MimicroserviceEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MimicroserviceEurekaApplication.class, args);
	}

}
