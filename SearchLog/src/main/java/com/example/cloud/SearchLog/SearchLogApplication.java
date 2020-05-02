package com.example.cloud.SearchLog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.example.cloud.SearchLog")
public class SearchLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchLogApplication.class, args);
	}

}
