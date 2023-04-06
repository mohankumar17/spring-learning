package com.bsl.demo;

public class TrackCoach implements Coach {
    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    public TrackCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    public String getDailyWorkout() {
        return "Run a hard 5KM";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside method doMyCleanupStuff");
    }
}
