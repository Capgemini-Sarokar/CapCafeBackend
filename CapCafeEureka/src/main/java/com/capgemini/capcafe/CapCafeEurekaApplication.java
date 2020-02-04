package com.capgemini.capcafe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CapCafeEurekaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CapCafeEurekaApplication.class, args);
	}
	
}