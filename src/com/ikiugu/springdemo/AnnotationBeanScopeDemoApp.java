package com.ikiugu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// read spring configuration
		ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// get the bean from container		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach anotherCoach = context.getBean("tennisCoach", Coach.class);
		
		// call methods
		boolean result = (theCoach == anotherCoach);
		
		System.out.println("Are they pointing to the same object? " + result);
		System.out.println("\n"+theCoach);
		System.out.println("\n"+anotherCoach);
			
		// close
		context.close();
	}

}
