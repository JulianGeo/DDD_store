package com.dddStore.dddstore.domain.saleOrder;

import com.dddStore.dddstore.domain.saleOrder.events.SaleOrderCreated;
import com.dddStore.dddstore.domain.saleOrder.values.DateS;
import com.dddStore.dddstore.domain.saleOrder.values.SaleDate;
import com.dddStore.dddstore.domain.saleOrder.values.SaleOrderID;
import com.dddStore.dddstore.domain.saleOrder.values.SalesCalendarID;
import com.dddStore.dddstore.generic.EventChange;

import java.time.LocalDate;
import java.util.List;

public class SaleOrderChange extends EventChange {

    public SaleOrderChange(SaleOrder saleOrder){
        apply((SaleOrderCreated event) -> {
            saleOrder.saleDate = new SaleDate(SaleOrderID.of(event.getSaleOrderID()), new DateS(LocalDate.now())) ;
        });

    }
}
