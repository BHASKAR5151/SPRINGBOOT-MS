package com.springboot.mongodb.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.springboot.mongodb.api.repository.ProductRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*@SpringBootApplication(scanBasePackages = { "com.springboot.mongodb.api", "com.springboot.mongodb.controller",
		"com.springboot.mongodb.model", "com.springboot.mongodb.service", "com.springboot.mongodb.ripository" })
*/
@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = ProductRepository.class)
@EnableSwagger2
public class SpringBootMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoDbApplication.class, args);
	}

	/*
	 * @Bean public Docket productApi() { return new
	 * Docket(DocumentationType.SWAGGER_2).select()
	 * .apis(RequestHandlerSelectors.basePackage("com.springboot.mongodb.api")).
	 * build(); }
	 */
}
