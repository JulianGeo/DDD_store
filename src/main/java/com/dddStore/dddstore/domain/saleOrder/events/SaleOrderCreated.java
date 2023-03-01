package com.dddStore.dddstore.domain.saleOrder.events;

import com.dddStore.dddstore.generic.DomainEvent;

import java.time.LocalDate;

public class SaleOrderCreated extends DomainEvent {
    private String saleOrderID;
    private LocalDate date;

    public SaleOrderCreated( String saleOrderID, LocalDate date) {
        super("dddStore.saleOrderCreated");
        this.saleOrderID = saleOrderID;
        this.date = date;
    }

    public String getSaleOrderID() {
        return saleOrderID;
    }

    public LocalDate getDate() {
        return date;
    }

}
