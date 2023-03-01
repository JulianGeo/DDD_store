package com.dddStore.dddstore.domain.delivery.values;

import com.dddStore.dddstore.generic.Identity;

public class DeliveryCalendarID extends Identity {

    public DeliveryCalendarID() {
    }

    private DeliveryCalendarID(String deliveryCalendarID) {
        super(deliveryCalendarID);
    }

    public static DeliveryCalendarID of(String deliveryCalendarID){
        return new DeliveryCalendarID(deliveryCalendarID);
    }
}
