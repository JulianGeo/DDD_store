package com.dddStore.dddstore.domain.saleOrder;

import com.dddStore.dddstore.domain.saleOrder.values.SaleOrderID;
import com.dddStore.dddstore.domain.saleOrder.values.Status;
import com.dddStore.dddstore.domain.saleOrder.values.Total;
import com.dddStore.dddstore.domain.staff.values.SalesmanID;
import com.dddStore.dddstore.generic.AggregateRoot;

public class SaleOrder extends AggregateRoot<SaleOrderID> {
    protected Client client;
    protected SalesCalendar salesCalendar;
    protected SalesmanID salesmanID;
    protected Status status;
    protected Total total;

    public SaleOrder(SaleOrderID id) {
        super(id);
        subscribe(new SaleOrderChange(this));
    }
}
