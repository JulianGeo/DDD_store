package com.dddStore.dddstore.business.staff;

import com.dddStore.dddstore.business.commons.EventsRepository;
import com.dddStore.dddstore.business.commons.UseCaseForCommand;
import com.dddStore.dddstore.domain.staff.Staff;
import com.dddStore.dddstore.domain.staff.commands.HireSalesmanCommand;
import com.dddStore.dddstore.domain.staff.values.StaffID;
import com.dddStore.dddstore.generic.DomainEvent;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HireSalesmanUseCase implements UseCaseForCommand<HireSalesmanCommand> {

    private final EventsRepository eventsRepository;

    public HireSalesmanUseCase(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

       @Override
    public List<DomainEvent> apply(HireSalesmanCommand command) {
        List<DomainEvent> userEvents =  eventsRepository.findByAggregatedRootId(command.getStaffID());
        Staff staff=Staff.from(StaffID.of((command.getStaffID())), userEvents);
        staff.hireSalesman(command.getSalesmanID(), command.getName(), command.getPersonalID(), command.getEmail(), command.getPhone(), command.getUser(), command.getPassword());
        return staff.getUncommittedChanges().stream().map(event->eventsRepository.saveEvent(event)).collect(Collectors.toList());
    }


}
