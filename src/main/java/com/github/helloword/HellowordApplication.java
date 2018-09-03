package com.github.helloword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HellowordApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellowordApplication.class, args);
    }

}
