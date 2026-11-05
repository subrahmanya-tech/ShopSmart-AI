package com.telusko.springecomai;

import org.springframework.ai.vectorstore.pgvector.autoconfigure.PgVectorStoreAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = PgVectorStoreAutoConfiguration.class)
public class SpringEcomAiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEcomAiApplication.class, args);
    }
}