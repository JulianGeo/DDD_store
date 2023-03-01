package com.dddStore.dddstore.domain.saleOrder.values;

import com.dddStore.dddstore.generic.Identity;

public class SalesCalendarID extends Identity {
    public SalesCalendarID() {
    }

    private SalesCalendarID(String salesCalendarID) {
        super(salesCalendarID);
    }

    public static SalesCalendarID of(String salesCalendarID){
        return new SalesCalendarID(salesCalendarID);
    }
}
