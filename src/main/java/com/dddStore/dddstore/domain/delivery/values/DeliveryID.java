package com.dddStore.dddstore.domain.delivery.values;

import com.dddStore.dddstore.domain.staff.values.DeliveryManID;
import com.dddStore.dddstore.generic.Identity;

public class DeliveryID extends Identity {

    public DeliveryID() {
    }

    private DeliveryID(String deliveryID) {
        super(deliveryID);
    }

    public static DeliveryID of(String deliveryID){
        return new DeliveryID(deliveryID);
    }
}
