package com.bsl.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Coach theCoach1 = context.getBean("myTrackCoach", Coach.class);
		//Coach theCoach2 = context.getBean("myTrackCoach", Coach.class);
		Coach theCoach1 = context.getBean("myTennisCoach", Coach.class);
		Coach theCoach2 = context.getBean("myTennisCoach", Coach.class);
		
		System.out.println(theCoach1.getDailyWorkout());
		System.out.println(theCoach1.getDailyFortune());
		
		System.out.println(theCoach1 == theCoach2);
	}

}
