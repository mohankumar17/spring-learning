package com.ioc.demo;

import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}