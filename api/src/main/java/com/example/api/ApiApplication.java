package com.example.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@PropertySources({
		@PropertySource(value = {"file:${api_configuration}"}, ignoreResourceNotFound = true)
})
@SpringBootApplication(scanBasePackages = "com.example")
public class ApiApplication {



	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
}
