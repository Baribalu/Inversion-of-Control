package com.cgm.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.cgm.service.contracts.StudentService;

@Service("concreteStudentService")
@Scope("prototype")
public class ConcreteStudentService implements StudentService {

	@Autowired
	@Qualifier("consoleStudentService")
	private StudentService studentService;
	
	public ConcreteStudentService() {
		System.out.println("Constructor for ConcreteStudentService");
	}
	
	@Override
	public float calculateWorth() {
		return studentService.calculateWorth();
	}
	
	@Override
	public void viewStudent() {
		studentService.viewStudent();
	}
	
}
