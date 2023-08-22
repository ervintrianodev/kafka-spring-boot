package com.evans.service;

import com.evans.events.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CustomerEventService {
    private final Logger LOGGER = LoggerFactory.getLogger(CustomerEventService.class);

    @KafkaListener(topics = {"customer-topic"}, containerFactory = "kafkaListenerContainerFactory",groupId = "grupo1")
    public void consumer(Event<?> event) {
        LOGGER.info("Mensaje Recibido: " + event.toString());
      /* if (event.getClass().isAssignableFrom(CustomerCreatedEvent.class)){
            CustomerCreatedEvent customerCreatedEvent = (CustomerCreatedEvent) event;
            LOGGER.info("Received Customer created event ... with Id={}, data={}", customerCreatedEvent.getId(), customerCreatedEvent.getData().toString());
        }*/
    }
}
