package com.rax.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	public static Logger logger= LoggerFactory.getLogger(SpringJenkinsApplication.class.getName());
	
	@PostConstruct
	public void init() {
		logger.info(" init () Application started ...");
		
	}

	public static void main(String[] args) {
		logger.info("Application executed ...");
		logger.info("Application executed ..two.");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
