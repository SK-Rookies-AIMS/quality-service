package com.aims.quality.websocket;

import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.broker.BrokerAvailabilityEvent;
import org.springframework.stereotype.Component;

@Component
public class BrokerEventListener {

    @EventListener
    public void brokerAvailability(BrokerAvailabilityEvent event) {

        System.out.println("Broker available = " + event.isBrokerAvailable());

    }

}