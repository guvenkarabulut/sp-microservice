package com.guvenkarabulut.notificationservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.support.serializer.ErrorHandlingDeserializer;

@Configuration
@EnableKafka
public class KafkaConfiguration {

    /**
     * Boot will autowire this into the container factory.
     */
    @Bean
    public ErrorHandlingDeserializer<String> errorHandler() {
        return new ErrorHandlingDeserializer<String>();
    }
}