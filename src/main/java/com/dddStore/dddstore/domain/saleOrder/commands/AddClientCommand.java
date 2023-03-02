package com.dddStore.dddstore.domain.saleOrder.commands;

import com.dddStore.dddstore.generic.Command;

// Creating a client with each call, but nosql works different, so no problem?
public class AddClientCommand extends Command {
    private String saleOrderID;
    private String ClientID;
    private String name;
    private String personalID;
    private String email;
    private String phone;
    private String user;
    private String password;
    private String coordinates;
    private String address;

    public AddClientCommand() {
    }

    public AddClientCommand(String saleOrderID, String clientID, String name, String personalID, String email, String phone, String user, String password, String coordinates, String address) {
        this.saleOrderID = saleOrderID;
        ClientID = clientID;
        this.name = name;
        this.personalID = personalID;
        this.email = email;
        this.phone = phone;
        this.user = user;
        this.password = password;
        this.coordinates = coordinates;
        this.address = address;
    }

    public String getSaleOrderID() {
        return saleOrderID;
    }

    public void setSaleOrderID(String saleOrderID) {
        this.saleOrderID = saleOrderID;
    }

    public String getClientID() {
        return ClientID;
    }

    public void setClientID(String clientID) {
        ClientID = clientID;
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

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
