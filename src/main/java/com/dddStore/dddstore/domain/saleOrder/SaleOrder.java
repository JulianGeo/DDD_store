package com.dddStore.dddstore.domain.saleOrder;

import com.dddStore.dddstore.domain.inventory.Inventory;
import com.dddStore.dddstore.domain.inventory.values.InventoryID;
import com.dddStore.dddstore.domain.saleOrder.events.SaleOrderCreated;
import com.dddStore.dddstore.domain.saleOrder.values.SaleDate;
import com.dddStore.dddstore.domain.saleOrder.values.SaleOrderID;
import com.dddStore.dddstore.domain.saleOrder.values.Status;
import com.dddStore.dddstore.domain.saleOrder.values.Total;
import com.dddStore.dddstore.domain.staff.values.SalesmanID;
import com.dddStore.dddstore.generic.AggregateRoot;
import com.dddStore.dddstore.generic.DomainEvent;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class SaleOrder extends AggregateRoot<SaleOrderID> {
    protected Client client;
    protected SaleDate saleDate;
    protected SalesmanID salesmanID;
    protected Status status;
    protected Total total;

    public SaleOrder(SaleOrderID id) {
        super(id);
        subscribe(new SaleOrderChange(this));
    }

    public static SaleOrder from(SaleOrderID id, List<DomainEvent> events){
        SaleOrder saleOrder = new SaleOrder(id);
        events.forEach(event -> saleOrder.applyEvent(event));
        return saleOrder;
    }
    public void createSaleOrder (String saleOrderID, LocalDate date){
        Objects.requireNonNull(saleOrderID);
        Objects.requireNonNull(date);
        appendChange(new SaleOrderCreated(saleOrderID, date)).apply();
    }
}
