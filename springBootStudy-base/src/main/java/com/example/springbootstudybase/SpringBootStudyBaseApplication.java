package com.example.springbootstudybase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan("com/example/springbootstudybase/filter/bean")
public class SpringBootStudyBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStudyBaseApplication.class, args);
    }

}
