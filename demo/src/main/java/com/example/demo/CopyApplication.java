package com.example.demo;

import com.example.demo.service.CopyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CopyApplication {

    public static void main(String[] args) {
        SpringApplication.run(CopyApplication.class, args);

        CopyService.run();
    }

}
