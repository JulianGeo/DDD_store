package com.dddStore.dddstore.business.saleOrder;

import com.dddStore.dddstore.business.commons.EventsRepository;
import com.dddStore.dddstore.business.commons.UseCaseForCommand;
import com.dddStore.dddstore.domain.saleOrder.SaleOrder;
import com.dddStore.dddstore.domain.saleOrder.commands.AddItemsCommand;
import com.dddStore.dddstore.domain.saleOrder.commands.AddSalesmanCommand;
import com.dddStore.dddstore.domain.saleOrder.values.SaleOrderID;
import com.dddStore.dddstore.generic.DomainEvent;

import java.util.List;

public class AddSalesmanUseCase implements UseCaseForCommand<AddSalesmanCommand> {

    private final EventsRepository eventsRepository;

    public AddSalesmanUseCase(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    @Override
    public List<DomainEvent> apply(AddSalesmanCommand command) {
        List<DomainEvent> userEvents =  eventsRepository.findByAggregatedRootId(command.getSaleOrderID());
        SaleOrder saleOrder=SaleOrder.from(SaleOrderID.of((command.getSaleOrderID())), userEvents);
        saleOrder.addSalesman(command.getSalesmanID());
        return saleOrder.getUncommittedChanges().stream().map(event->eventsRepository.saveEvent(event)).toList();
    }
}
