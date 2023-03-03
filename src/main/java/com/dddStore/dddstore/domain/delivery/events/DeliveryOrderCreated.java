package com.dddStore.dddstore.domain.delivery.events;

import com.dddStore.dddstore.generic.DomainEvent;

import java.time.LocalDate;

public class DeliveryOrderCreated extends DomainEvent {



    public DeliveryOrderCreated() {
        super("dddStore.deliveryOrderCreated");
    }

}
