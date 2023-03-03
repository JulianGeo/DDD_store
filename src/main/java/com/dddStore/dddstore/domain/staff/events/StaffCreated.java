package com.dddStore.dddstore.domain.staff.events;

import com.dddStore.dddstore.generic.DomainEvent;

public class StaffCreated extends DomainEvent {


    public StaffCreated() {
        super("dddStore.staffCreated");

    }


}
