package com.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    //We will create new topic with the help of NewTopic class from kafka
    @Bean
    public NewTopic topic(){
        return TopicBuilder
                .name(AppConstants.LOCATION_TOPIC_NAME)
//                .partitions()
//                .replicas()
                .build();
    }
}
