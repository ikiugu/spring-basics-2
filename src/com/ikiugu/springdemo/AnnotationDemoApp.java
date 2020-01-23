package com.ikiugu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from container
		Coach theCoach = context.getBean("thatCoach", Coach.class);
		
		// call methods
		System.out.println(theCoach.getDailyWorkout());
		
		// close the container
		context.close();
	}

}
