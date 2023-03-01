package com.dddStore.dddstore.domain.accounting;

import com.dddStore.dddstore.domain.accounting.values.AccountingID;
import com.dddStore.dddstore.domain.saleOrder.values.SaleOrderID;
import com.dddStore.dddstore.generic.AggregateRoot;
import com.dddStore.dddstore.generic.DomainEvent;

import java.util.List;

public class Accounting extends AggregateRoot<AccountingID> {
    protected List<SaleOrderID> sales;
    protected List<PurchaseOrder> purchases;

    public Accounting(AccountingID id) {
        super(id);
        subscribe(new AccountingChange(this));
    }

    public static Accounting from(AccountingID id, List<DomainEvent> events){
        Accounting accounting = new Accounting(id);
        events.forEach(event -> accounting.applyEvent(event));
        return accounting;
    }
}
