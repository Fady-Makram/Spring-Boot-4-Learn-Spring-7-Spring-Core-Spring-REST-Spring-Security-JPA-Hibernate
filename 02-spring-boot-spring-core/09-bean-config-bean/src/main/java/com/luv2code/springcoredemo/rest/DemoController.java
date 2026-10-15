package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach anotherCoach ;

    @Autowired
    public DemoController(@Qualifier("aqua")Coach theCoach) {


        System.out.println("In constructor: " + getClass().getSimpleName());
        this.myCoach = theCoach;

    }

    @GetMapping("/dialyworkout")
    public String getDialyworkout() {
        return myCoach.getDailyWorkout();
    }

}
