package com.auditing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class AuditingApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuditingApplication.class, args);
    }

}