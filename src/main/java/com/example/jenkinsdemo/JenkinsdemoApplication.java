package com.example.jenkinsdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsdemoApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(JenkinsdemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JenkinsdemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		logger.info("Application Started ");
		logger.info("Checking automatic build trigger");


	}
}
