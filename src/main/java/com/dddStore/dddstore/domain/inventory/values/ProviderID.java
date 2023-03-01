package com.dddStore.dddstore.domain.inventory.values;

import com.dddStore.dddstore.generic.Identity;

public class ProviderID extends Identity {

    public ProviderID() {
    }

    public ProviderID(String providerID) {
        super(providerID);
    }

    public static ProviderID of(String providerID){
        return new ProviderID(providerID);
    }
}
