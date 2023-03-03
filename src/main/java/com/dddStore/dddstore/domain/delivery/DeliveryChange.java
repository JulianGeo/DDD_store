package com.dddStore.dddstore.domain.delivery;

import com.dddStore.dddstore.domain.delivery.events.DeliveryManAdded;
import com.dddStore.dddstore.domain.delivery.events.DeliveryOrderCreated;
import com.dddStore.dddstore.domain.delivery.events.VehicleAdded;
import com.dddStore.dddstore.domain.delivery.values.*;
import com.dddStore.dddstore.domain.saleOrder.values.SaleOrderID;
import com.dddStore.dddstore.domain.staff.values.DeliveryManID;
import com.dddStore.dddstore.generic.EventChange;

import java.time.LocalDate;

public class DeliveryChange extends EventChange {
    public DeliveryChange(Delivery delivery){

        apply((DeliveryOrderCreated event) -> {
        });

        //This consumer is intended to also add a destination location to the deliveryMan
        apply((DeliveryManAdded event) -> {
            delivery.deliveryManID = DeliveryManID.of(event.getDeliveryManID());
        });

        apply((VehicleAdded event) -> {
            delivery.vehicle = new Vehicle(VehicleID.of(event.getVehicleID()),
                    new VehicleData(new VehicleType(event.getVehicleType()), new LicencePlate(event.getVehicleLicensePlate())),
                    new Soat(new ExpirationDate(event.getSoatExpirationDate())),
                    new MechCertificate(new ExpirationDate(event.getMechCertExpirationDate())),
                    new VehicleStatus(event.getStatus()));
        });



    }
}
