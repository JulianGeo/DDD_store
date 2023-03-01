package com.dddStore.dddstore.domain.staff;

import com.dddStore.dddstore.domain.staff.events.DeliveryManHired;
import com.dddStore.dddstore.domain.staff.events.SalesmanHired;
import com.dddStore.dddstore.domain.staff.values.StaffID;
import com.dddStore.dddstore.generic.AggregateRoot;

import java.util.List;
import java.util.Objects;

public class Staff extends AggregateRoot<StaffID> {

    protected List<Salesman> salesmen;
    protected List<DeliveryMan> deliveryMen;
    public Staff(StaffID id) {
        super(id);
        subscribe(new StaffChange(this));
    }

    public void hireSalesman(String salesmanID, String name, String personalID, String email, String phone, String user, String password){
        Objects.requireNonNull(salesmanID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(personalID);
        Objects.requireNonNull(email);
        Objects.requireNonNull(phone);
        Objects.requireNonNull(user);
        Objects.requireNonNull(password);
        appendChange(new SalesmanHired(salesmanID, name, personalID, email, phone, user, password)).apply();
    }

    public void hireDeliveryMan(String deliveryManID, String name, String personalID, String email, String phone, String user, String password, String coordinates, String address) {
        Objects.requireNonNull(deliveryManID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(personalID);
        Objects.requireNonNull(email);
        Objects.requireNonNull(phone);
        Objects.requireNonNull(user);
        Objects.requireNonNull(password);
        Objects.requireNonNull(coordinates);
        Objects.requireNonNull(address);
        appendChange(new DeliveryManHired(deliveryManID, name, personalID, email, phone, user, password, coordinates, address)).apply();
    }
}
