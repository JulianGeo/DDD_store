package com.dddStore.dddstore.domain.saleOrder;

import com.dddStore.dddstore.domain.inventory.values.ItemID;
import com.dddStore.dddstore.domain.saleOrder.events.ClientAdded;
import com.dddStore.dddstore.domain.saleOrder.events.ItemsAdded;
import com.dddStore.dddstore.domain.saleOrder.events.SaleOrderCreated;
import com.dddStore.dddstore.domain.saleOrder.events.SalesmanAdded;
import com.dddStore.dddstore.domain.saleOrder.values.*;
import com.dddStore.dddstore.domain.sharedValues.*;
import com.dddStore.dddstore.domain.staff.values.SalesmanID;
import com.dddStore.dddstore.generic.EventChange;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SaleOrderChange extends EventChange {

    public SaleOrderChange(SaleOrder saleOrder){
        apply((SaleOrderCreated event) -> {
            saleOrder.saleDate = new SaleDate(SaleOrderID.of(event.getSaleOrderID()), new DateS(LocalDate.now())) ;
            saleOrder.items = new HashMap<>();
        });

        apply((ClientAdded event) -> {
           Client client  = new Client(
                   ClientID.of(event.getClientID()),
                   new Location(new Address(event.getAddress()), new Coordinates(event.getCoordinates())),
                   new Data(new PersonalID(event.getPersonalID()), new Name(event.getName()), new Email(event.getEmail()), new Phone(event.getPhone())),
                   new Account(new User(event.getUser()), new Password(event.getPassword()))
           );
           saleOrder.client = client;
        });

        apply((SalesmanAdded event) -> {
            saleOrder.salesmanID = SalesmanID.of(event.getSalesmanID());
        });

        apply((ItemsAdded event) -> {
            saleOrder.items.put(ItemID.of(event.getItemID()), new Amount(event.getAmount()));
        });

    }


}
