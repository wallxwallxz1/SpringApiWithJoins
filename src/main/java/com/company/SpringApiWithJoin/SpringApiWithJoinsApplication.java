package com.company.SpringApiWithJoin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringApiWithJoinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiWithJoinsApplication.class, args);
	}
}
