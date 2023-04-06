package com.di.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		
        //BaseballCoach theCoach = context.getBean("myBaseballCoach", BaseballCoach.class);
		//Coach theCoach = context.getBean("myCricketCoach", Coach.class);
		//Coach theCoach = context.getBean("myTennisCoach", Coach.class);
		//Coach theCoach = context.getBean("mySwimCoach", Coach.class);
		//TennisCoach theCoach = context.getBean(TennisCoach.class);
		SwimCoach theCoach = context.getBean("mySwimCoach", SwimCoach.class);
		
        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getExperience());
	}

}
