package com.dong.ourplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class OurPlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(OurPlaygroundApplication.class, args);
	}

}
