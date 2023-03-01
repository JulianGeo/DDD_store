package com.dddStore.dddstore.domain.delivery;

import com.dddStore.dddstore.domain.delivery.values.*;
import com.dddStore.dddstore.generic.Entity;

import java.util.Objects;


public class Vehicle extends Entity<VehicleID> {
    private VehicleData vehicleData;
    private Soat soat;
    private MechCertificate mechCertificate;
    private VehicleStatus vehicleStatus;

    public Vehicle(VehicleID entityID, VehicleData vehicleData, Soat soat, MechCertificate mechCertificate, VehicleStatus vehicleStatus) {
        super(entityID);
        this.vehicleData = Objects.requireNonNull(vehicleData);
        this.soat =  Objects.requireNonNull(soat);
        this.mechCertificate = Objects.requireNonNull(mechCertificate);
        this.vehicleStatus = Objects.requireNonNull(vehicleStatus);
    }

    public VehicleData vehicleData() {
        return vehicleData;
    }

    public Soat soat() {
        return soat;
    }

    public MechCertificate mechCertificate() {
        return mechCertificate;
    }

    public VehicleStatus vehicleStatus() {
        return vehicleStatus;
    }
}
