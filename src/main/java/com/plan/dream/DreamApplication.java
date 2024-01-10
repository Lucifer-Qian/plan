package com.plan.dream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 97336
 */
@SpringBootApplication
@ComponentScan(value = "com.plan.dream.dao")
public class DreamApplication {

    public synchronized static void main(String[] args) {
        try {
            SpringApplication.run(DreamApplication.class, args);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
