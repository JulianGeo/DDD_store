package com.dddStore.dddstore.domain.inventory;

import com.dddStore.dddstore.domain.accounting.values.AccountingID;
import com.dddStore.dddstore.domain.inventory.events.InventoryCreated;
import com.dddStore.dddstore.generic.EventChange;

import java.util.HashMap;

public class InventoryChange extends EventChange {

    public InventoryChange(Inventory inventory){
        apply((InventoryCreated event) -> {
            inventory.items = new HashMap<>();
        } );

    }
}
