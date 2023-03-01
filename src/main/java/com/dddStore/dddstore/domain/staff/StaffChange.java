package com.dddStore.dddstore.domain.staff;

import com.dddStore.dddstore.domain.sharedValues.*;
import com.dddStore.dddstore.domain.staff.commands.HireSalesmanCommand;
import com.dddStore.dddstore.domain.staff.events.DeliveryManHired;
import com.dddStore.dddstore.domain.staff.events.SalesmanHired;
import com.dddStore.dddstore.domain.staff.events.StaffCreated;
import com.dddStore.dddstore.domain.staff.values.*;
import com.dddStore.dddstore.generic.EventChange;

import java.util.ArrayList;

public class StaffChange extends EventChange {

    public StaffChange(Staff staff){

        apply((StaffCreated event) -> {
            staff.salesmen =  new ArrayList<>();
            staff.deliveryMen =  new ArrayList<>();
        });


        apply((SalesmanHired event) -> {
            Salesman salesman = new Salesman(
                    SalesmanID.of(event.getSalesmanID()),
                    new Data(new PersonalID(event.getPersonalID()), new Name(event.getName()), new Email(event.getEmail()), new Phone(event.getPhone())),
                    new Account(new User(event.getUser()), new Password(event.getPassword()))
            );
            staff.salesmen.add(salesman);

        });

        apply((DeliveryManHired event) -> {
            DeliveryMan deliveryMan = new DeliveryMan(
                    DeliveryManID.of(event.getDeliveryManID()),
                    new Data(new PersonalID(event.getPersonalID()), new Name(event.getName()), new Email(event.getEmail()), new Phone(event.getPhone())),
                    new Account(new User(event.getUser()), new Password(event.getPassword())),
                    new Location( new Address(event.getAddress()), new Coordinates(event.getCoordinates())),
                    new Location(new Address(event.getAddress()), new Coordinates(event.getCoordinates()))
            );
            staff.deliveryMen.add(deliveryMan);
        });
}}
