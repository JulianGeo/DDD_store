package com.dddStore.dddstore.domain.delivery.events;

import com.dddStore.dddstore.generic.DomainEvent;

import java.time.LocalDate;

public class DeliveryOrderCreated extends DomainEvent {

    private String saleOrderID;
    private LocalDate dateD;

    public DeliveryOrderCreated(String saleOrderID, LocalDate dateD) {
        super("dddStore.deliveryOrderCreated");
        this.saleOrderID = saleOrderID;
        this.dateD = dateD;
    }

    public String getSaleOrderID() {
        return saleOrderID;
    }

    public void setSaleOrderID(String saleOrderID) {
        this.saleOrderID = saleOrderID;
    }

    public LocalDate getDateD() {
        return dateD;
    }

    public void setDateD(LocalDate dateD) {
        this.dateD = dateD;
    }
}
