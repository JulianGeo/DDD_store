package com.dddStore.dddstore.domain.staff;

import com.dddStore.dddstore.domain.staff.values.Account;
import com.dddStore.dddstore.domain.staff.values.Data;
import com.dddStore.dddstore.domain.staff.values.DeliveryManID;
import com.dddStore.dddstore.domain.staff.values.Location;
import com.dddStore.dddstore.generic.Entity;

import java.util.Objects;


public class DeliveryMan extends Entity<DeliveryManID> {

    private Data data;
    private Account account;
    private Location currentLocation;
    private Location destiantionLocation;

    public DeliveryMan(DeliveryManID id, Data data, Account account, Location currentLocation, Location destiantionLocation) {
        super(id);
        this.data = Objects.requireNonNull(data);
        this.account = Objects.requireNonNull(account);
        this.currentLocation = Objects.requireNonNull(currentLocation) ;
        this.destiantionLocation = Objects.requireNonNull(destiantionLocation);
    }


    public Data data() {
        return data;
    }

    public Account account() {
        return account;
    }
}
