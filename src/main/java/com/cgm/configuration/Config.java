package com.cgm.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cgm.service.contracts.StudentService;
import com.cgm.service.implementations.ConsoleStudentService;

@Configuration
@ComponentScan("com.cgm")
public class Config {

	@Bean
	public StudentService consoleStudentService() {
		System.out.println("Console student @Bean in Config");
		return new ConsoleStudentService();
	}
	
}
