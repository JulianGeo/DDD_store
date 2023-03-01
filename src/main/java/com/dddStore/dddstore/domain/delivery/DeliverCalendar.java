package com.dddStore.dddstore.domain.delivery;

import com.dddStore.dddstore.domain.delivery.values.DeliveryCalendarID;
import com.dddStore.dddstore.domain.delivery.values.DeliveryDate;
import com.dddStore.dddstore.generic.Entity;

import java.util.List;

public class DeliverCalendar extends Entity<DeliveryCalendarID> {
    private List<DeliveryDate> dates;

    public DeliverCalendar(DeliveryCalendarID entityID, List<DeliveryDate> dates) {
        super(entityID);
        this.dates = dates;
    }

    public List<DeliveryDate> dates() {
        return dates;
    }
}
