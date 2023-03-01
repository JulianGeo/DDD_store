package com.dddStore.dddstore.domain.saleOrder;


import com.dddStore.dddstore.domain.saleOrder.values.ClientID;
import com.dddStore.dddstore.domain.sharedValues.Account;
import com.dddStore.dddstore.domain.sharedValues.Data;
import com.dddStore.dddstore.domain.sharedValues.Location;
import com.dddStore.dddstore.generic.Entity;

import java.util.Objects;

public class Client extends Entity<ClientID> {
    private Location location;
    private Data data;
    private Account account;

    public Client(ClientID entityID, Location location, Data data, Account account) {
        super(entityID);
        this.location = Objects.requireNonNull(location);
        this.data = Objects.requireNonNull(data);
        this.account = Objects.requireNonNull(account);
    }

    public Location location() {
        return location;
    }

    public Data data() {
        return data;
    }

    public Account account() {
        return account;
    }
}
