package com.dddStore.dddstore.business.delivery;

import com.dddStore.dddstore.business.commons.EventsRepository;
import com.dddStore.dddstore.business.commons.UseCaseForCommand;
import com.dddStore.dddstore.domain.delivery.Delivery;
import com.dddStore.dddstore.domain.delivery.commands.AddVehicleCommand;
import com.dddStore.dddstore.domain.delivery.values.DeliveryID;
import com.dddStore.dddstore.domain.saleOrder.SaleOrder;
import com.dddStore.dddstore.domain.saleOrder.values.SaleOrderID;
import com.dddStore.dddstore.generic.DomainEvent;

import java.util.List;

public class AddVehicleUseCase implements UseCaseForCommand<AddVehicleCommand> {
    private final EventsRepository eventsRepository;

    public AddVehicleUseCase(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    @Override
    public List<DomainEvent> apply(AddVehicleCommand command) {
        List<DomainEvent> userEvents =  eventsRepository.findByAggregatedRootId(command.getVehicleID());
        Delivery delivery=Delivery.from(DeliveryID.of((command.getDeliveryID())), userEvents);
        delivery.addVehicle(command.getVehicleID(), command.getVehicleType(), command.getVehicleLicensePlate(), command.getSoatExpirationDate(), command.getMechCertExpirationDate(), command.getStatus());
        return delivery.getUncommittedChanges().stream().map(event->eventsRepository.saveEvent(event)).toList();
    }

}
