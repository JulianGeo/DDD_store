package com.dddStore.dddstore.domain.staff.events;

import com.dddStore.dddstore.generic.DomainEvent;

public class DeliveryManHired extends DomainEvent {

    private String deliveryManID;
    private String name;
    private String personalID;
    private String email;
    private String phone;
    private String user;
    private String password;
    private String coordinates;
    private String address;

    public DeliveryManHired(String deliveryManID, String name, String personalID, String email, String phone, String user, String password, String coordinates, String address) {
        super("dddStore.deliverymanhired");
        this.deliveryManID = deliveryManID;
        this.name = name;
        this.personalID = personalID;
        this.email = email;
        this.phone = phone;
        this.user = user;
        this.password = password;
        this.coordinates = coordinates;
        this.address = address;
    }

    public String getDeliveryManID() {
        return deliveryManID;
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

    public String getCoordinates() {
        return coordinates;
    }

    public String getAddress() {
        return address;
    }
}
