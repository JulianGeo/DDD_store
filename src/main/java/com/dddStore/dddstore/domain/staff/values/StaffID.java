package com.dddStore.dddstore.domain.staff.values;

import com.dddStore.dddstore.generic.Identity;

public class StaffID extends Identity {

    public StaffID() {
    }

    public StaffID(String staffID) {
        super(staffID);
    }

    public static StaffID of (String staffID){
        return new StaffID(staffID);

    }
}
