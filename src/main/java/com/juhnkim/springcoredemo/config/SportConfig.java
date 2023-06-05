package com.juhnkim.springcoredemo.config;

import com.juhnkim.springcoredemo.common.Coach;
import com.juhnkim.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
