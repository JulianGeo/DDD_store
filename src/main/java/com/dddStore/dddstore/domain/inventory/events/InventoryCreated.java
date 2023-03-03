package com.dddStore.dddstore.domain.inventory.events;

import com.dddStore.dddstore.generic.DomainEvent;

public class InventoryCreated extends DomainEvent {


    public InventoryCreated() {
        super("dddStore.inventoryCreated");

    }

}
