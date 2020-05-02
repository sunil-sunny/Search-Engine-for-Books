package com.example.cloud.RecordNotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.example.cloud.RecordNotes")
public class RecordNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecordNotesApplication.class, args);
	}

}
