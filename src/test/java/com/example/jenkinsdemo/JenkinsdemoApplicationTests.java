package com.example.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class JenkinsdemoApplicationTests {

	Logger logger = LoggerFactory.getLogger(JenkinsdemoApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test Case is being executed");
	}

}
