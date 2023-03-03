package com.dddStore.dddstore.business.inventory;

import com.dddStore.dddstore.business.commons.EventsRepository;
import com.dddStore.dddstore.business.commons.UseCaseForCommand;
import com.dddStore.dddstore.domain.inventory.Inventory;
import com.dddStore.dddstore.domain.inventory.commands.CreateInventoryCommand;
import com.dddStore.dddstore.domain.inventory.values.InventoryID;
import com.dddStore.dddstore.generic.DomainEvent;

import java.util.List;

public class CreateInventoryUseCase implements UseCaseForCommand<CreateInventoryCommand> {
    private final EventsRepository eventsRepository;

    public CreateInventoryUseCase(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    @Override
    public List<DomainEvent> apply(CreateInventoryCommand command) {
        Inventory inventory = new Inventory(InventoryID.of(command.getInventoryID()));
        return inventory.getUncommittedChanges().stream().map(event->eventsRepository.saveEvent(event)).toList();
    }
}
