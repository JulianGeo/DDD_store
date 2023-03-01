package com.dddStore.dddstore.domain.inventory;

import com.dddStore.dddstore.domain.inventory.values.ItemID;
import com.dddStore.dddstore.domain.inventory.values.Price;
import com.dddStore.dddstore.generic.Entity;

public class Item extends Entity<ItemID> {
    private Provider provider;
    private Price price;

    public Item(ItemID entityID, Provider provider, Price price) {
        super(entityID);
        this.provider = provider;
        this.price = price;
    }

    public Provider provider() {
        return provider;
    }

    public Price price() {
        return price;
    }
}
