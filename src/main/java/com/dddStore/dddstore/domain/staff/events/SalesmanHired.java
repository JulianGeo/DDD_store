package com.dddStore.dddstore.domain.staff.events;

import com.dddStore.dddstore.generic.DomainEvent;

public class SalesmanHired extends DomainEvent {

    private String salesmanID;
    private String name;
    private String personalID;
    private String email;
    private String phone;
    private String user;
    private String password;

    public SalesmanHired( String salesmanID, String name, String personalID, String email, String phone, String user, String password) {
        super("dddStore.salesmanhired");
        this.salesmanID = salesmanID;
        this.name = name;
        this.personalID = personalID;
        this.email = email;
        this.phone = phone;
        this.user = user;
        this.password = password;
    }

    public String getSalesmanID() {
        return salesmanID;
    }

    public String getName() {
        return name;
    }

    public String getPersonalID() {
        return personalID;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
