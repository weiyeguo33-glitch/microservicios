package com.mimicroservice.libro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MimicroserviceLibroApplication {

	public static void main(String[] args) {
		SpringApplication.run(MimicroserviceLibroApplication.class, args);
	}

}
