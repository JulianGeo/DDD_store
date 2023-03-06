package com.dddStore.dddstore.domain.delivery.commands;

import com.dddStore.dddstore.generic.Command;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class CreateDeliveryOrderCommand extends Command {

    private String deliveryID;
    private String saleOrderID;
    private LocalDate dateD;

    public CreateDeliveryOrderCommand(String deliveryID) {
        this.deliveryID = deliveryID;
    }
}
