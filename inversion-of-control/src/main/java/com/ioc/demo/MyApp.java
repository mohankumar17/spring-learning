package com.ioc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);

        // retrieve bean from spring container
        //Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theCoach = context.getBean("baseballCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
	}

}
