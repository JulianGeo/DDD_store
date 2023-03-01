package com.dddStore.dddstore.domain.saleOrder;

import com.dddStore.dddstore.domain.saleOrder.events.SaleOrderCreated;
import com.dddStore.dddstore.domain.saleOrder.values.SalesCalendarID;
import com.dddStore.dddstore.generic.EventChange;

public class SaleOrderChange extends EventChange {

    public SaleOrderChange(SaleOrder saleOrder){
        apply((SaleOrderCreated event) -> {
            saleOrder.salesCalendar = new SalesCalendar(new SalesCalendarID())
        });

    }
}
