package com.dddStore.dddstore.domain.staff.events;

import com.dddStore.dddstore.generic.DomainEvent;

public class StaffCreated extends DomainEvent {

    private String staffID;

    public StaffCreated(String staffID) {
        super("dddStore.staffCreated");
        this.staffID = staffID;
    }

    public String getStaffID() {
        return staffID;
    }
}
