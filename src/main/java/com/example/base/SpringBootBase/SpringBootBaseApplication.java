package com.example.base.SpringBootBase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EntityScan(basePackages = { "com.example.base.SpringBootBase.Model" })
public class SpringBootBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBaseApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
