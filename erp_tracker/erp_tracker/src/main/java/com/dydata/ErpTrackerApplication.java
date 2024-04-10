package com.dydata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ErpTrackerApplication implements CommandLineRunner{
	
	Logger logger = LoggerFactory.getLogger(ErpTrackerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ErpTrackerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.trace("I am Trace");
		logger.debug("I am debug");
		logger.info("I am info");
		logger.warn("I am warn");
		logger.error("I am error");
		
	}

}
