package com.mashibing.internalcommons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class InternalCommonsApplication {

    public static void main(String[] args) {
        SpringApplication.run(InternalCommonsApplication.class, args);
    }

}
