package org.edukar.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EdukarSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdukarSchoolApplication.class, args);
		log.info("Running school service...");
	}

}
