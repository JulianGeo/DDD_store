package com.dddStore.dddstore.domain.accounting;

import com.dddStore.dddstore.domain.accounting.values.*;
import com.dddStore.dddstore.domain.inventory.values.InventoryID;
import com.dddStore.dddstore.domain.inventory.values.ItemID;
import com.dddStore.dddstore.domain.inventory.values.ProviderID;
import com.dddStore.dddstore.generic.Entity;

import java.util.Map;

public class PurchaseOrder extends Entity<PurchaseOrderID> {
    private PurchaseDate purchaseDate;
    private InventoryID inventoryID;
    private Map<ItemID, Amount> items;
    private ProviderID providerID;
    private Total total;
    private Status status;


    public PurchaseOrder(PurchaseOrderID entityID, PurchaseDate purchaseDate, InventoryID inventoryID, Map<ItemID, Amount> items, ProviderID providerID, Total total, Status status) {
        super(entityID);
        this.purchaseDate = purchaseDate;
        this.inventoryID = inventoryID;
        this.items = items;
        this.providerID = providerID;
        this.total = total;
        this.status = status;
    }

    public PurchaseDate purchaseDate() {
        return purchaseDate;
    }

    public InventoryID inventoryID() {
        return inventoryID;
    }

    public Map<ItemID, Amount> items() {
        return items;
    }

    public ProviderID providerID() {
        return providerID;
    }

    public Total total() {
        return total;
    }

    public Status status() {
        return status;
    }
}
