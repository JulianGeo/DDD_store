package com.dddStore.dddstore.domain.delivery;

import com.dddStore.dddstore.domain.accounting.Accounting;
import com.dddStore.dddstore.domain.accounting.values.AccountingID;
import com.dddStore.dddstore.domain.delivery.values.DeliveryID;
import com.dddStore.dddstore.domain.saleOrder.values.SaleOrderID;
import com.dddStore.dddstore.domain.staff.values.DeliveryManID;
import com.dddStore.dddstore.generic.AggregateRoot;
import com.dddStore.dddstore.generic.DomainEvent;

import java.util.List;

public class Delivery extends AggregateRoot<DeliveryID> {
    protected DeliverCalendar deliverCalendar;
    protected Vehicle vehicle;
    protected SaleOrderID saleOrderID;
    protected DeliveryManID deliveryManID;


    public Delivery(DeliveryID id) {
        super(id);
        subscribe(new DeliveryChange(this));
    }

    public static Delivery from(DeliveryID id, List<DomainEvent> events){
        Delivery delivery = new Delivery(id);
        events.forEach(event -> delivery.applyEvent(event));
        return delivery;
    }
}
