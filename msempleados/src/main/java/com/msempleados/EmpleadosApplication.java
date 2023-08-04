package com.msempleados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.Persistence.repository")
@EntityScan("com.Persistence.entity")
public class EmpleadosApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpleadosApplication.class, args);
	}

}
