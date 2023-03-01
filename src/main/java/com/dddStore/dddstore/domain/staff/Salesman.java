package com.dddStore.dddstore.domain.staff;

import com.dddStore.dddstore.domain.staff.values.Account;
import com.dddStore.dddstore.domain.staff.values.Data;
import com.dddStore.dddstore.domain.staff.values.SalesmanID;
import com.dddStore.dddstore.generic.Entity;

import java.util.Objects;

public class Salesman extends Entity<SalesmanID> {

    private Data data;
    private Account account;

    public Salesman(SalesmanID entityID, Data data, Account account) {
        super(entityID);
        this.data = Objects.requireNonNull(data);
        this.account = Objects.requireNonNull(account);
    }


    public Data data() {
        return data;
    }

    public Account account() {
        return account;
    }
}
