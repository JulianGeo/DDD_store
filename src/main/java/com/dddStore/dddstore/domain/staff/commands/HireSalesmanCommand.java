package com.dddStore.dddstore.domain.staff.commands;

import com.dddStore.dddstore.generic.Command;

public class HireSalesmanCommand extends Command {
    private String staffID;
    private String salesmanID;
    private String name;
    private String personalID;
    private String email;
    private String phone;
    private String user;
    private String password;

    public HireSalesmanCommand() {
    }

    public HireSalesmanCommand(String staffID, String salesmanID, String name, String personalID, String email, String phone, String user, String password) {
        this.staffID = staffID;
        this.salesmanID = salesmanID;
        this.name = name;
        this.personalID = personalID;
        this.email = email;
        this.phone = phone;
        this.user = user;
        this.password = password;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getSalesmanID() {
        return salesmanID;
    }

    public void setSalesmanID(String salesmanID) {
        this.salesmanID = salesmanID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalID() {
        return personalID;
    }

    public void setPersonalID(String personalID) {
        this.personalID = personalID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
