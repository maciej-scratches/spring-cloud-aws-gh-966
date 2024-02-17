package com.example.springcloudawsgh2005;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudAwsGh2005Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAwsGh2005Application.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(@Value("${some-message}") String message) {
        return args -> System.out.println("from parameter store: " + message);
    }

}
