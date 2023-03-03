package com.dddStore.dddstore.domain.saleOrder.events;

import com.dddStore.dddstore.generic.DomainEvent;

import java.time.LocalDate;

public class SaleOrderCreated extends DomainEvent {
    private String saleOrderID;

    public SaleOrderCreated( String saleOrderID) {
        super("dddStore.saleOrderCreated");
        this.saleOrderID = saleOrderID;

    }

    public String getSaleOrderID() {
        return saleOrderID;
    }


}
