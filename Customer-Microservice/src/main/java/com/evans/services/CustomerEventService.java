package com.evans.services;


import com.evans.events.Event;
import com.evans.events.EventType;
import com.evans.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
public class CustomerEventService {
    @Autowired
    private KafkaTemplate<String, Event<?>> producer;

    public void publish(Customer customer) {
        Event<Customer> customerEvent = new Event<>();
        customerEvent.setData(customer);
        customerEvent.setId(UUID.randomUUID().toString());
        customerEvent.setType(EventType.CREATED);
        customerEvent.setDate(new Date());
        this.producer.send("customer-topic", customerEvent);

    }
}
