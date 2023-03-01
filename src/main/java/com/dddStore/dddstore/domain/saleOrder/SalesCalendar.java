package com.dddStore.dddstore.domain.saleOrder;

import com.dddStore.dddstore.domain.saleOrder.values.SaleDate;
import com.dddStore.dddstore.domain.saleOrder.values.SalesCalendarID;
import com.dddStore.dddstore.generic.Entity;

import java.util.List;

public class SalesCalendar extends Entity<SalesCalendarID> {
    private List<SaleDate> saleDates;

    public SalesCalendar(SalesCalendarID EntityID, List<SaleDate> saleDates) {
        super(EntityID);
        this.saleDates = saleDates;
    }

    public List<SaleDate> saleDates() {
        return saleDates;
    }
}
