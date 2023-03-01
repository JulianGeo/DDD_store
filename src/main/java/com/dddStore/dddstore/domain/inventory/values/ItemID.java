package com.dddStore.dddstore.domain.inventory.values;

import com.dddStore.dddstore.generic.Identity;

public class ItemID extends Identity {

    public ItemID() {
    }

    public ItemID(String itemID) {
        super(itemID);
    }

    public static ItemID of(String itemID){
        return new ItemID(itemID);
    }
}