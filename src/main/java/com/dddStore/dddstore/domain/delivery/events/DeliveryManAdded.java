package com.dddStore.dddstore.domain.delivery.events;

import com.dddStore.dddstore.generic.DomainEvent;

public class DeliveryManAdded extends DomainEvent {

    private String deliveryManID;

    public DeliveryManAdded(String deliveryManID) {
        super("dddStore.DeliveryManAdded");
        this.deliveryManID = deliveryManID;
    }

    public String getDeliveryManID() {
        return deliveryManID;
    }

    public void setDeliveryManID(String deliveryManID) {
        this.deliveryManID = deliveryManID;
    }

}
