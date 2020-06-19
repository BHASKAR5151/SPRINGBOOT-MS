package com.example.price;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*@EnableDiscoveryClient*/
@EnableSwagger2
@SpringBootApplication
public class PriceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriceServiceApplication.class, args);
	}
	
	@Bean
	/* @LoadBalanced */
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
