package com.mauro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.expression.SecurityExpressionHandler;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.FilterInvocation;

@SpringBootApplication
public class SpringBabbiSicuriApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(SpringBabbiSicuriApplication.class, args);
	}

}
