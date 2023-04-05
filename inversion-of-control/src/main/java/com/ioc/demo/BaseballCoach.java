package com.ioc.demo;

import org.springframework.stereotype.Component;

@Component("baseballCoach")
public class BaseballCoach implements Coach {
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
}