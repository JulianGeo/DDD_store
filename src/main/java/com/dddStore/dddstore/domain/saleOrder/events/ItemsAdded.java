package com.dddStore.dddstore.domain.saleOrder.events;

import com.dddStore.dddstore.generic.DomainEvent;

public class ItemsAdded extends DomainEvent {
    private String itemID;
    private Integer amount;

    public ItemsAdded(String itemID, Integer amount) {
        super("ddd.itemsAdded");
        this.itemID = itemID;
        this.amount = amount;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}

