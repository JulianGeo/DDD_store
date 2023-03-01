package com.dddStore.dddstore.domain.inventory;

import com.dddStore.dddstore.domain.delivery.Delivery;
import com.dddStore.dddstore.domain.delivery.values.DeliveryID;
import com.dddStore.dddstore.domain.inventory.values.InventoryID;
import com.dddStore.dddstore.domain.inventory.values.ItemID;
import com.dddStore.dddstore.domain.inventory.values.Stock;
import com.dddStore.dddstore.generic.AggregateRoot;
import com.dddStore.dddstore.generic.DomainEvent;

import java.util.List;
import java.util.Map;

public class Inventory extends AggregateRoot<InventoryID> {
    protected Map<ItemID, Stock> items;

    public Inventory(InventoryID entityID) {
        super(entityID);
        subscribe(new InventoryChange(this));
    }

    public static Inventory from(InventoryID id, List<DomainEvent> events){
        Inventory inventory = new Inventory(id);
        events.forEach(event -> inventory.applyEvent(event));
        return inventory;
    }
}
