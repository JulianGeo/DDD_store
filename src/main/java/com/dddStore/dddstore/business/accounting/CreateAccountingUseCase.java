package com.dddStore.dddstore.business.accounting;

import com.dddStore.dddstore.business.commons.EventsRepository;
import com.dddStore.dddstore.business.commons.UseCaseForCommand;
import com.dddStore.dddstore.domain.accounting.Accounting;
import com.dddStore.dddstore.domain.accounting.commands.CreateAccountingCommand;
import com.dddStore.dddstore.domain.accounting.values.AccountingID;
import com.dddStore.dddstore.generic.DomainEvent;

import java.util.List;

public class CreateAccountingUseCase implements UseCaseForCommand<CreateAccountingCommand> {
    private final EventsRepository eventsRepository;

    public CreateAccountingUseCase(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    @Override
    public List<DomainEvent> apply(CreateAccountingCommand command) {

        Accounting accounting = new Accounting(AccountingID.of(command.getAccountingID()));
        return accounting.getUncommittedChanges().stream().map(event->eventsRepository.saveEvent(event)).toList();
    }
}
