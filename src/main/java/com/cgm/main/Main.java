package com.cgm.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgm.configuration.Config;
import com.cgm.service.contracts.StudentService;

public class Main {

	public final static Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("/application-context.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		StudentService studentService = (StudentService) context.getBean("concreteStudentService");
		studentService.viewStudent();
		
		studentService = (StudentService) context.getBean("concreteStudentService");
		studentService.viewStudent();
		
		studentService = (StudentService) context.getBean("consoleStudentService");
		studentService.viewStudent();
		

		((ConfigurableApplicationContext)context).close();
	}
	
}
