package com.dddStore.dddstore.business.staff;

import com.dddStore.dddstore.business.commons.EventsRepository;
import com.dddStore.dddstore.business.commons.UseCaseForCommand;
import com.dddStore.dddstore.domain.staff.Staff;
import com.dddStore.dddstore.domain.staff.commands.HireDeliveryManCommand;
import com.dddStore.dddstore.domain.staff.values.StaffID;
import com.dddStore.dddstore.generic.DomainEvent;

import java.util.List;

public class HireDeliveryManUseCase implements UseCaseForCommand<HireDeliveryManCommand> {
    private final EventsRepository eventsRepository;

    public HireDeliveryManUseCase(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    @Override
    public List<DomainEvent> apply(HireDeliveryManCommand command) {
        List<DomainEvent> userEvents =  eventsRepository.findByAggregatedRootId(command.getStaffID());
        Staff staff=Staff.from(StaffID.of((command.getStaffID())), userEvents);
        staff.hireDeliveryMan(command.getDeliveryManID(), command.getName(), command.getPersonalID(), command.getEmail(), command.getPhone(), command.getUser(), command.getPassword(), command.getCoordinates(), command.getAddress());
        return staff.getUncommittedChanges().stream().map(event->eventsRepository.saveEvent(event)).toList();
    }


}
