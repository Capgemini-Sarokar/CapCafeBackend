package com.capgemini.capcafe.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CapCafeReviewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapCafeReviewsApplication.class, args);
	}

}
