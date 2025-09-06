package com.mimicroservice.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MimicroserviceConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MimicroserviceConfigApplication.class, args);
	}

}
