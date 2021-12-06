package com.project.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class NetflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixApplication.class, args);
	}

}
