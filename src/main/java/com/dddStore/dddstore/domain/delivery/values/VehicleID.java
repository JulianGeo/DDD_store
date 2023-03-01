package com.dddStore.dddstore.domain.delivery.values;

import com.dddStore.dddstore.generic.Identity;

public class VehicleID extends Identity {

    public VehicleID() {
    }

    public VehicleID(String vehicleID) {
        super(vehicleID);
    }

    public static VehicleID of(String vehicleID){
        return new VehicleID(vehicleID);
    }
}
