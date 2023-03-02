package com.dddStore.dddstore.domain.delivery.commands;

import com.dddStore.dddstore.generic.Command;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class AddVehicleCommand extends Command {
    private String deliveryID;
    private String vehicleID;
    private String vehicleType;
    private String vehicleLicensePlate;
    private LocalDate soatExpirationDate;
    private LocalDate mechCertExpirationDate;
    private String status;

}
