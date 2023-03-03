package com.dddStore.dddstore.domain.accounting;

import com.dddStore.dddstore.domain.accounting.events.AccountingCreated;
import com.dddStore.dddstore.domain.sharedValues.Account;
import com.dddStore.dddstore.generic.EventChange;

import java.util.ArrayList;

public class AccountingChange extends EventChange {
    public AccountingChange(Accounting accounting){
        apply((AccountingCreated event) -> {
            accounting.purchases = new ArrayList<>();
            accounting.sales = new ArrayList<>();
        });
    }
}
