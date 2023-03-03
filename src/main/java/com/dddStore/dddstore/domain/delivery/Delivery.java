package com.dddStore.dddstore.domain.delivery;

import com.dddStore.dddstore.domain.accounting.Accounting;
import com.dddStore.dddstore.domain.accounting.values.AccountingID;
import com.dddStore.dddstore.domain.delivery.events.DeliveryManAdded;
import com.dddStore.dddstore.domain.delivery.events.DeliveryOrderCreated;
import com.dddStore.dddstore.domain.delivery.events.VehicleAdded;
import com.dddStore.dddstore.domain.delivery.values.DeliveryDate;
import com.dddStore.dddstore.domain.delivery.values.DeliveryID;
import com.dddStore.dddstore.domain.inventory.events.InventoryCreated;
import com.dddStore.dddstore.domain.saleOrder.values.SaleOrderID;
import com.dddStore.dddstore.domain.staff.values.DeliveryManID;
import com.dddStore.dddstore.generic.AggregateRoot;
import com.dddStore.dddstore.generic.DomainEvent;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Delivery extends AggregateRoot<DeliveryID> {
    protected Vehicle vehicle;
    protected SaleOrderID saleOrderID;
    protected DeliveryManID deliveryManID;
    protected DeliveryDate deliveryDate;

    public Delivery(DeliveryID id) {
        super(id);
        subscribe(new DeliveryChange(this));
        appendChange(new DeliveryOrderCreated()).apply();
    }

    public static Delivery from(DeliveryID id, List<DomainEvent> events){
        Delivery delivery = new Delivery(id);
        events.forEach(event -> delivery.applyEvent(event));
        return delivery;
    }

    public void addDeliveryMan(String deliveryManID){
        Objects.requireNonNull(deliveryManID);
        appendChange(new DeliveryManAdded(deliveryManID)).apply();
    }

    public void addVehicle(String vehicleID, String vehicleType, String vehicleLicensePlate, LocalDate soatExpirationDate, LocalDate mechCertExpirationDate, String status){
        Objects.requireNonNull(vehicleID);
        Objects.requireNonNull(vehicleType);
        Objects.requireNonNull(vehicleLicensePlate);
        Objects.requireNonNull(soatExpirationDate);
        Objects.requireNonNull(mechCertExpirationDate);
        Objects.requireNonNull(status);
        appendChange(new VehicleAdded(vehicleID,vehicleType,vehicleLicensePlate,soatExpirationDate,mechCertExpirationDate,status)).apply();
    }


}
