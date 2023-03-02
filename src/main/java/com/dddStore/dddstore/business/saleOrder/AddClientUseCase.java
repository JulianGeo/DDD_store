package com.dddStore.dddstore.business.saleOrder;

import com.dddStore.dddstore.business.commons.EventsRepository;
import com.dddStore.dddstore.business.commons.UseCaseForCommand;
import com.dddStore.dddstore.domain.saleOrder.SaleOrder;
import com.dddStore.dddstore.domain.saleOrder.commands.AddClientCommand;
import com.dddStore.dddstore.domain.saleOrder.values.SaleOrderID;
import com.dddStore.dddstore.generic.DomainEvent;

import java.util.List;

public class AddClientUseCase implements UseCaseForCommand<AddClientCommand> {

    private final EventsRepository eventsRepository;

    public AddClientUseCase(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    @Override
    public List<DomainEvent> apply(AddClientCommand command) {
        List<DomainEvent> userEvents =  eventsRepository.findByAggregatedRootId(command.getSaleOrderID());
        SaleOrder saleOrder=SaleOrder.from(SaleOrderID.of((command.getSaleOrderID())), userEvents);
        saleOrder.addClient(command.getClientID(), command.getName(), command.getPersonalID(), command.getEmail(), command.getPhone(), command.getUser(), command.getPassword(), command.getCoordinates(), command.getAddress());
        return saleOrder.getUncommittedChanges().stream().map(event->eventsRepository.saveEvent(event)).toList();
    }


}
