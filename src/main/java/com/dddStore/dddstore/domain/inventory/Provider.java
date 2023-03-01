package com.dddStore.dddstore.domain.inventory;

import com.dddStore.dddstore.domain.inventory.values.ProviderID;
import com.dddStore.dddstore.domain.sharedValues.Account;
import com.dddStore.dddstore.domain.sharedValues.Data;
import com.dddStore.dddstore.generic.Entity;

public class Provider extends Entity<ProviderID> {
    private Data data;
    private Account account;

    public Provider(ProviderID entityID, Data data, Account account) {
        super(entityID);
        this.data = data;
        this.account = account;
    }

    public Data data() {
        return data;
    }

    public Account account() {
        return account;
    }
}
