package com.example.OrderShipment.Controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class EventListener {

    @JmsListener(destination = "DEV.QUEUE.1")
    public void listen(String message) {
        System.out.println(message);
    }
}
