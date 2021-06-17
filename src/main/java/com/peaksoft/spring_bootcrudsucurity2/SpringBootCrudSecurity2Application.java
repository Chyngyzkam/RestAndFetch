package com.peaksoft.spring_bootcrudsucurity2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//        (exclude = DataSourceAutoConfiguration.class)

public class SpringBootCrudSecurity2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCrudSecurity2Application.class, args);
    }

}
