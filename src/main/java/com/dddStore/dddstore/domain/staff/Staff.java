package com.dddStore.dddstore.domain.staff;

import com.dddStore.dddstore.domain.staff.values.StaffID;
import com.dddStore.dddstore.generic.AggregateRoot;

import java.util.List;

public class Staff extends AggregateRoot<StaffID> {

    protected List<Salesman> salesmen;
    protected List<DeliveryMan> deliveryMen;
    public Staff(StaffID id) {
        super(id);
    }
}
