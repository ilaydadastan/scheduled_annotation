package com.example.interval;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class IntervalApplication {

    public static void main(String[] args) {{SpringApplication.run(IntervalApplication.class, args);
    }

}
    @Scheduled(fixedRate = 30000)
    public void scheduling(){

        System.out.println( "Hello World");
        }

}