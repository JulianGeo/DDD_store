package com.dddStore.dddstore.domain.staff.commands;

import com.dddStore.dddstore.generic.Command;

public class CreateStaffCommand extends Command {

    private String staffID;

    public CreateStaffCommand() {
    }

    public CreateStaffCommand(String staffID) {
        this.staffID = staffID;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }
}
