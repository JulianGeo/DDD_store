package com.dddStore.dddstore.domain.accounting.commands;

import com.dddStore.dddstore.generic.Command;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateAccountingCommand extends Command {
    private String accountingID;
}
