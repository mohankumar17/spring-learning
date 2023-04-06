package com.di.demo;

public class CricketCoach implements Coach {
	
    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    // create setter methods for injections
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}