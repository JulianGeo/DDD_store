package com.dddStore.dddstore.domain.saleOrder.values;

import com.dddStore.dddstore.generic.Identity;

public class SaleOrderID extends Identity {

    public SaleOrderID() {
    }

    public SaleOrderID(String saleOrderID) {
        super(saleOrderID);
    }

    public static SaleOrderID of (String saleOrderID){
        return new SaleOrderID(saleOrderID);
    }
}
