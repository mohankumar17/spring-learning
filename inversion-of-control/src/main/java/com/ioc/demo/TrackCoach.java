package com.ioc.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("trackingCoach")
@Scope(scopeName = "prototype")
public class TrackCoach implements Coach {
    public String getDailyWorkout() {
        return "Run a hard 5 KM";
    }
}
