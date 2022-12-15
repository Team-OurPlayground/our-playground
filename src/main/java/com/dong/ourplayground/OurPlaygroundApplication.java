package com.dong.ourplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication(exclude = SecurityAutoConfiguration.class) // TODO: 인증 개발 완료되면 활성화
public class OurPlaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(OurPlaygroundApplication.class, args);
	}

}
