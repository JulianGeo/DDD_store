package com.dddStore.dddstore.domain.inventory.commands;

import com.dddStore.dddstore.generic.Command;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateInventoryCommand extends Command {
    private String inventoryID;
    private String accountingID;
}
