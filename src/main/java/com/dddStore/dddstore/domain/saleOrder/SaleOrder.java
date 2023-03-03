package com.dddStore.dddstore.domain.saleOrder;

import com.dddStore.dddstore.domain.inventory.values.ItemID;
import com.dddStore.dddstore.domain.saleOrder.events.ClientAdded;
import com.dddStore.dddstore.domain.saleOrder.events.ItemsAdded;
import com.dddStore.dddstore.domain.saleOrder.events.SaleOrderCreated;
import com.dddStore.dddstore.domain.saleOrder.events.SalesmanAdded;
import com.dddStore.dddstore.domain.saleOrder.values.SaleDate;
import com.dddStore.dddstore.domain.saleOrder.values.SaleOrderID;
import com.dddStore.dddstore.domain.saleOrder.values.Status;
import com.dddStore.dddstore.domain.sharedValues.Amount;
import com.dddStore.dddstore.domain.sharedValues.Total;
import com.dddStore.dddstore.domain.staff.values.SalesmanID;
import com.dddStore.dddstore.generic.AggregateRoot;
import com.dddStore.dddstore.generic.DomainEvent;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class SaleOrder extends AggregateRoot<SaleOrderID> {
    protected Client client;
    protected SaleDate saleDate;
    protected SalesmanID salesmanID;
    protected Status status;
    protected Total total;
    protected Map<ItemID, Amount> items;

    public SaleOrder(SaleOrderID id) {
        super(id);
        subscribe(new SaleOrderChange(this));
        appendChange(new SaleOrderCreated(id.toString())).apply();
    }

    public static SaleOrder from(SaleOrderID id, List<DomainEvent> events){
        SaleOrder saleOrder = new SaleOrder(id);
        events.forEach(event -> saleOrder.applyEvent(event));
        return saleOrder;
    }
    public void createSaleOrder (String saleOrderID, LocalDate date){
        Objects.requireNonNull(saleOrderID);
        Objects.requireNonNull(date);
        appendChange(new SaleOrderCreated(saleOrderID)).apply();
    }

    public void addClient (String clientID, String name, String personalID, String email, String phone, String user, String password, String coordinates, String address){
        Objects.requireNonNull(clientID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(personalID);
        Objects.requireNonNull(email);
        Objects.requireNonNull(phone);
        Objects.requireNonNull(user);
        Objects.requireNonNull(password);
        Objects.requireNonNull(coordinates);
        Objects.requireNonNull(address);
        appendChange(new ClientAdded(clientID, name, personalID, email, phone, user, password, coordinates, address)).apply();
    }

    public void addSalesman (String salesmanID){
        Objects.requireNonNull(salesmanID);
        appendChange(new SalesmanAdded(salesmanID)).apply();
    }

    public void addItems(String itemID, Integer amount){
        Objects.requireNonNull(itemID);
        Objects.requireNonNull(amount);
        appendChange(new ItemsAdded(itemID, amount)).apply();
    }
}
