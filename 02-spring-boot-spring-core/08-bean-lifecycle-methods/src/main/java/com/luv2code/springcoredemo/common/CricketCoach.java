package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    //define init method
    @PostConstruct
    public void doSomethingAtStartup() {
        System.out.println("In doSomethingAtStartup: " + getClass().getSimpleName());
    }

    //define destroy method
    @PreDestroy
    public void doSomethingAtShutdown() {
        System.out.println("In doSomethingAtShutdown: " + getClass().getSimpleName());
    }



    @Override
    public String getDailyWorkout() {
        return "returned from Cricket coach";
    }
}


