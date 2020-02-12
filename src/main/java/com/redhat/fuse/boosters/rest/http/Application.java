package com.redhat.fuse.boosters.rest.http;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    /**
     * Main method to start the application.
     */
    public static void main(String[] args) {
        String doNothing = "Hello World!";
        doNothing += " A useless string!";
        System.out.println(doNothing);
        SpringApplication.run(Application.class, args);
    }

}