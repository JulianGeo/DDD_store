package com.dddStore.dddstore.domain.saleOrder.events;

import com.dddStore.dddstore.generic.DomainEvent;

public class SalesmanAdded extends DomainEvent {

    private String salesmanID;

    public SalesmanAdded(String salesmanID) {
        super("dddStore.SalesmanAddedToSalesOrder");
        this.salesmanID = salesmanID;
    }

    public String getSalesmanID() {
        return salesmanID;
    }

    public void setSalesmanID(String salesmanID) {
        this.salesmanID = salesmanID;
    }
}
