package com.dddStore.dddstore.domain.accounting;

import com.dddStore.dddstore.domain.accounting.values.AccountingID;
import com.dddStore.dddstore.domain.saleOrder.values.SaleOrderID;
import com.dddStore.dddstore.generic.AggregateRoot;

import java.util.List;

public class Accounting extends AggregateRoot<AccountingID> {
    protected List<SaleOrderID> sales;
    protected List<PurchaseOrder> purchases;

    public Accounting(AccountingID id) {
        super(id);
        subscribe(new AccountingChange(this));
    }
}
