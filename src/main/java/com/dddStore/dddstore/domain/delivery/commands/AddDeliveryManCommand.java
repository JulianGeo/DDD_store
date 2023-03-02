package com.dddStore.dddstore.domain.delivery.commands;

import com.dddStore.dddstore.generic.Command;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddDeliveryManCommand extends Command {

    private String deliveryID;
    private String deliveryManID;


}
