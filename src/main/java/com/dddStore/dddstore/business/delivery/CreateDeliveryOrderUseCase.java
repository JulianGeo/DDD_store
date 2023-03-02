package com.dddStore.dddstore.business.delivery;

import com.dddStore.dddstore.business.commons.EventsRepository;
import com.dddStore.dddstore.business.commons.UseCaseForCommand;
import com.dddStore.dddstore.domain.delivery.Delivery;
import com.dddStore.dddstore.domain.delivery.commands.CreateDeliveryOrderCommand;
import com.dddStore.dddstore.domain.delivery.values.DeliveryID;
import com.dddStore.dddstore.generic.DomainEvent;

import java.util.List;


public class CreateDeliveryOrderUseCase implements UseCaseForCommand<CreateDeliveryOrderCommand> {
    private final EventsRepository eventsRepository;

    public CreateDeliveryOrderUseCase(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    @Override
    public List<DomainEvent> apply(CreateDeliveryOrderCommand command) {

        Delivery delivery = new Delivery(DeliveryID.of(command.getDeliveryID()));
        return delivery.getUncommittedChanges().stream().map(event->eventsRepository.saveEvent(event)).toList();
    }
}
