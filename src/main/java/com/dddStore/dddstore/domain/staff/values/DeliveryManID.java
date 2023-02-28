package com.dddStore.dddstore.domain.staff.values;

import com.dddStore.dddstore.generic.Identity;

public class DeliveryManID extends Identity {

    public DeliveryManID() {
    }

    public DeliveryManID(String deliveryManId) {
        super(deliveryManId);
    }

    public static DeliveryManID of(String deliveryManId){
        return new DeliveryManID(deliveryManId);
    }
}
