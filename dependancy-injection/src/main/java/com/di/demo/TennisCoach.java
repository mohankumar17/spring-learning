package com.di.demo;

import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myTennisCoach")
public class TennisCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
	/*@Autowired
    public TennisCoach(FortuneService theFortuneService) {
		System.out.println("TennisCoach: Constructor Injection");
        fortuneService = theFortuneService;
    }*/
	
	public TennisCoach() {
		System.out.println("TennisCoach: No-Arg Constructor");
	}
	
	@Autowired
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

}