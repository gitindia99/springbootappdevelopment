package com.org.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
public class SpringbootApplicationDevelopmentApplication extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(SpringbootApplicationDevelopmentApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplicationDevelopmentApplication.class, args);
		System.out.println("Helllo Every one..");
	}

}
