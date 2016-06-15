package com.example;

import com.example.repo.DataRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JsonTestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonTestProjectApplication.class, args);
	}

	@Bean
	public DataRepository dataRepository() {
		return new DataRepository();
	}
}
