package com.dddStore.dddstore.domain.inventory;

import com.dddStore.dddstore.domain.inventory.values.InventoryID;
import com.dddStore.dddstore.domain.inventory.values.ItemID;
import com.dddStore.dddstore.domain.inventory.values.Stock;
import com.dddStore.dddstore.generic.AggregateRoot;

import java.util.Map;

public class Inventory extends AggregateRoot<InventoryID> {
    protected Map<ItemID, Stock> items;

    // correct this word inside inventoryChange
    public Inventory(InventoryID entityID) {
        super(entityID);
        subscribe(new InventoryChange());
    }
}
