package com.cgm.service.implementations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.cgm.service.contracts.StudentService;

//@Service("consoleStudentService")
public class ConsoleStudentService implements StudentService{
	
	public ConsoleStudentService() {
		System.out.println("Constructor for ConsoleStudentService");
	}
	
	@Override
	public float calculateWorth() {
		System.out.println("Console worth is 10!");
		return 10;
	}
	
	@Override
	public void viewStudent() {
		System.out.println("Console student print!");
	}
	
}
