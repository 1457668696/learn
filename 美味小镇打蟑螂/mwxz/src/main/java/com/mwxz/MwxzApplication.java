package com.mwxz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MwxzApplication {

    public static void main(String[] args) {
        SpringApplication.run(MwxzApplication.class, args);
    }

}
