package org.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

@SpringBootApplication
public class MongoApp {

    public static void main(String[] args) {
        SpringApplication.run(MongoApp.class, args);
    }

    @Bean
    public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory, MongoMappingContext context) {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory);

        return mongoTemplate;

    }
}
