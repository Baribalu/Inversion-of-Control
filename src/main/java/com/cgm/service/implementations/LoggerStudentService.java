package com.cgm.service.implementations;

import org.springframework.stereotype.Service;

import com.cgm.main.Main;
import com.cgm.service.contracts.StudentService;

@Service("loggerStudentService")
public class LoggerStudentService implements StudentService {

	public LoggerStudentService() {
		Main.logger.info("Constructor for LoggerStudentService");
	}
	
	@Override
	public float calculateWorth() {
		Main.logger.info("Student worth is 9!");
		return 10;
	}
	
	@Override
	public void viewStudent() {
		Main.logger.info("View Student!");
	}
	
}
