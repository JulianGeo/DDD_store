package com.dddStore.dddstore.business.delivery;

import com.dddStore.dddstore.business.commons.EventsRepository;
import com.dddStore.dddstore.business.commons.UseCaseForCommand;
import com.dddStore.dddstore.domain.delivery.Delivery;
import com.dddStore.dddstore.domain.delivery.commands.AddDeliveryManCommand;
import com.dddStore.dddstore.domain.delivery.commands.AddVehicleCommand;
import com.dddStore.dddstore.domain.delivery.values.DeliveryID;
import com.dddStore.dddstore.generic.DomainEvent;

import java.util.List;

public class AddDeliveryManUseCase implements UseCaseForCommand<AddDeliveryManCommand> {
    private final EventsRepository eventsRepository;

    public AddDeliveryManUseCase(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }


    @Override
    public List<DomainEvent> apply(AddDeliveryManCommand command) {
        List<DomainEvent> userEvents =  eventsRepository.findByAggregatedRootId(command.getDeliveryID());
        Delivery delivery=Delivery.from(DeliveryID.of((command.getDeliveryID())), userEvents);
        delivery.addDeliveryMan(command.getDeliveryManID());
        return delivery.getUncommittedChanges().stream().map(event->eventsRepository.saveEvent(event)).toList();
    }
}
