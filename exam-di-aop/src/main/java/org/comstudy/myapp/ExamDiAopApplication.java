package org.comstudy.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class ExamDiAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamDiAopApplication.class, args);
	}

}
