package com.dddStore.dddstore.domain.delivery;

import com.dddStore.dddstore.domain.delivery.values.DeliveryID;
import com.dddStore.dddstore.domain.saleOrder.values.SaleOrderID;
import com.dddStore.dddstore.domain.staff.values.DeliveryManID;
import com.dddStore.dddstore.generic.AggregateRoot;

public class Delivery extends AggregateRoot<DeliveryID> {
    protected DeliverCalendar deliverCalendar;
    protected Vehicle vehicle;
    protected SaleOrderID saleOrderID;
    protected DeliveryManID deliveryManID;


    public Delivery(DeliveryID id) {
        super(id);
        subscribe(new DeliveryChange(this));
    }
}
