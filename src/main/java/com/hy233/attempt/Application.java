package com.hy233.attempt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@EnableConfigurationProperties
@SpringBootApplication(exclude = {MongoAutoConfiguration.class, RedisAutoConfiguration.class})
@ComponentScan(value = "com.hy233")
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

}
