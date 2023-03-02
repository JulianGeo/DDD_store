package com.dddStore.dddstore.domain.delivery.events;

import com.dddStore.dddstore.generic.DomainEvent;

import java.time.LocalDate;

public class VehicleAdded extends DomainEvent {

    private String vehicleID;
    private String vehicleType;
    private String vehicleLicensePlate;
    private LocalDate soatExpirationDate;
    private LocalDate mechCertExpirationDate;
    private String status;

    public VehicleAdded(String vehicleID, String vehicleType, String vehicleLicensePlate, LocalDate soatExpirationDate, LocalDate mechCertExpirationDate, String status) {
        super("dddStore.VehicleAdded");
        this.vehicleID = vehicleID;
        this.vehicleType = vehicleType;
        this.vehicleLicensePlate = vehicleLicensePlate;
        this.soatExpirationDate = soatExpirationDate;
        this.mechCertExpirationDate = mechCertExpirationDate;
        this.status = status;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleLicensePlate() {
        return vehicleLicensePlate;
    }

    public void setVehicleLicensePlate(String vehicleLicensePlate) {
        this.vehicleLicensePlate = vehicleLicensePlate;
    }

    public LocalDate getSoatExpirationDate() {
        return soatExpirationDate;
    }

    public void setSoatExpirationDate(LocalDate soatExpirationDate) {
        this.soatExpirationDate = soatExpirationDate;
    }

    public LocalDate getMechCertExpirationDate() {
        return mechCertExpirationDate;
    }

    public void setMechCertExpirationDate(LocalDate mechCertExpirationDate) {
        this.mechCertExpirationDate = mechCertExpirationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
