package com.bsl.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myTennisCoach")
@Scope("prototype")
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("TennisCoach: No-Arg Constructor");
	}
	
	@Autowired
	//@Qualifier("myFortuneService") //Only below setter method will be used for dependency injection
    public void setFortuneService(FortuneService theFortuneService) {
        System.out.println("TennisCoach: Setter Injection");
        fortuneService = theFortuneService;
    }
	
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
    public void doMyStartupStuff() {
        System.out.println("TennisCoach: inside method doMyStartupStuff");
    }
	
	@PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("TennisCoach: inside method doMyCleanupStuff");
    }

}