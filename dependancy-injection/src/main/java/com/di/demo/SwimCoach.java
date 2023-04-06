package com.di.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mySwimCoach")
public class SwimCoach implements Coach {

    @Value("${exp.years}")
    private int experience;

	private FortuneService fortuneService;

    @Autowired
    public SwimCoach(FortuneService theFortuneService) {
    	System.out.println("SwimCoach: Constructor Injection");
        fortuneService = theFortuneService;
    }

    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
    public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
}