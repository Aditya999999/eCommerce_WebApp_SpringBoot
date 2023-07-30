package com.ecommerce.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.converter.json.GsonBuilderUtils;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
@Configuration
@ComponentScan(basePackages = {"com.ecommerce.demo.controllers","com.ecommerce.demo.service", "com.ecommerce.demo.repository"})
public class ECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

//	@Bean
//	public Docket productApi() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.basePackage("com.ecommerce.demo")).build();
//	}
}
