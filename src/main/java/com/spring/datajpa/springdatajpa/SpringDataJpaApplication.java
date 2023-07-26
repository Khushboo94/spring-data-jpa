package com.spring.datajpa.springdatajpa;

import com.spring.datajpa.springdatajpa.hibernate.jpa.Client;
import com.spring.datajpa.springdatajpa.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ClientRepository clientRepository) {
		return args -> clientRepository.save(new Client("Alan", "123 Young St",
				"Canada", "0003331234",
				"Canadian", "2000-01-01"));
	}

}
