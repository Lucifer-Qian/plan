package com.plan.dream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 97336
 */
@SpringBootApplication(scanBasePackages="com.plan.dream")
public class DreamApplication {

    public synchronized static void main(String[] args) {
        try {
            SpringApplication.run(DreamApplication.class, args);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
