package com.dddStore.dddstore.domain.accounting.values;

import com.dddStore.dddstore.domain.saleOrder.values.SaleOrderID;
import com.dddStore.dddstore.generic.Identity;

public class PurchaseOrderID extends Identity {

    public PurchaseOrderID() {
    }

    public PurchaseOrderID(String purchaseOrderID) {
        super(purchaseOrderID);
    }

    public static PurchaseOrderID of (String purchaseOrderID){
        return new PurchaseOrderID(purchaseOrderID);
    }
}