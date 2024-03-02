package com.xunyat.assist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class IvpProAssistApplication {

    public static void main(String[] args) {
        SpringApplication.run(IvpProAssistApplication.class, args);
    }

}
