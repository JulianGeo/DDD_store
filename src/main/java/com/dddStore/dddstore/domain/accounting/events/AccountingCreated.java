package com.dddStore.dddstore.domain.accounting.events;

import com.dddStore.dddstore.generic.DomainEvent;

public class AccountingCreated extends DomainEvent {

    public AccountingCreated() {
        super("dddStore.accountingCreated");
    }
}
