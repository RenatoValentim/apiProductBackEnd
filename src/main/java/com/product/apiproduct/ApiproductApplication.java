package com.product.apiproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ServletComponentScan
@Configuration
@EnableWebMvc
@SpringBootApplication
public class ApiproductApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(ApiproductApplication.class, args);
	}

}
