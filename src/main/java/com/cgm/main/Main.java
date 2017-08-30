package com.cgm.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgm.service.contracts.StudentService;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/application-context.xml");
		
		StudentService studentService = (StudentService) context.getBean("concreteStudentService");
		studentService.viewStudent();
		
		studentService = (StudentService) context.getBean("concreteStudentService");
		studentService.viewStudent();
		
	}
	
}
