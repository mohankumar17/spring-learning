package com.di.demo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	private int experience;

	public BaseballCoach(FortuneService fortuneService) {
		System.out.println("BaseballCoach: inside arg constructor (fortuneService)");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		System.out.println("BaseballCoach: inside setter method - setExperiece");
		this.experience = experience;
	}
}