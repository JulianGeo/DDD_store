package com.dddStore.dddstore.business.saleOrder;

import com.dddStore.dddstore.business.commons.EventsRepository;
import com.dddStore.dddstore.business.commons.UseCaseForCommand;
import com.dddStore.dddstore.domain.saleOrder.SaleOrder;
import com.dddStore.dddstore.domain.saleOrder.commands.CreateSaleOrderCommand;
import com.dddStore.dddstore.domain.saleOrder.values.SaleOrderID;
import com.dddStore.dddstore.generic.DomainEvent;

import java.util.List;
import java.util.stream.Collectors;

public class CreateSaleOrderUseCase implements UseCaseForCommand<CreateSaleOrderCommand> {

    private final EventsRepository eventsRepository;

    public CreateSaleOrderUseCase(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    @Override
    public List<DomainEvent> apply(CreateSaleOrderCommand command) {
        // Do i need to add thinks to the constructor?
        SaleOrder saleOrder = new SaleOrder(SaleOrderID.of(command.getSaleOrderID()));
        return saleOrder.getUncommittedChanges().stream().map(event->eventsRepository.saveEvent(event)).collect(Collectors.toList());
    }

}
