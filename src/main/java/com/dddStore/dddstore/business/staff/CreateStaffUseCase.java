package com.dddStore.dddstore.business.staff;

import com.dddStore.dddstore.business.commons.EventsRepository;
import com.dddStore.dddstore.business.commons.UseCaseForCommand;
import com.dddStore.dddstore.domain.staff.Staff;
import com.dddStore.dddstore.domain.staff.commands.CreateStaffCommand;
import com.dddStore.dddstore.domain.staff.values.StaffID;
import com.dddStore.dddstore.generic.DomainEvent;

import java.util.List;
import java.util.stream.Collectors;

public class CreateStaffUseCase implements UseCaseForCommand<CreateStaffCommand> {

    private final EventsRepository eventsRepository;

    public CreateStaffUseCase(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    @Override
    public List<DomainEvent> apply(CreateStaffCommand command) {
        // Do i need to add the empty lists of employees here? ... or with the events dynamic is enough?
        // or can i do it with a method inside the same class?
        Staff staff = new Staff(StaffID.of(command.getStaffID()));
        return staff.getUncommittedChanges().stream().map(event->eventsRepository.saveEvent(event)).toList();
    }

}
