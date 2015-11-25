package com.example.rabbitmq;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Gary Russell
 * @author Scott Deeg
 *
 */
@SpringBootApplication
@EnableScheduling
public class RabbitMQTutorialsApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RabbitMQTutorialsApplication.class, args);
    }

}