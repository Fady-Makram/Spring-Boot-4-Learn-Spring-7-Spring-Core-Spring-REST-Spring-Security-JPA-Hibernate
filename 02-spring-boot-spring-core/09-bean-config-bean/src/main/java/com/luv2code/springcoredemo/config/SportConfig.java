package com.luv2code.springcoredemo.config;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aqua")
    public Coach swimCoach(){
        return new SwimCoach();
    }
    //this method will receive an obj from class SwimCoach from this code: return new SwimCoach();
    //this obj of type Coach (the interface): public Coach swimCoach()
    //this obj will be retuned from the method: swimCoach() (obj id) --> which will pass it to spring context to use it
    //or we can use custome bean id @Bean("aqua") this id called in @Qualifier
}
