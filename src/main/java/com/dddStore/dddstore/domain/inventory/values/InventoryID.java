package com.dddStore.dddstore.domain.inventory.values;

import com.dddStore.dddstore.generic.Identity;

public class InventoryID extends Identity {

    public InventoryID() {
    }

    public InventoryID(String inventoryID) {
        super(inventoryID);
    }

    public static InventoryID of(String inventoryID){
        return new InventoryID(inventoryID);
    }
}