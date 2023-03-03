package com.dddStore.dddstore.business.staff;

import com.dddStore.dddstore.business.commons.EventsRepository;
import com.dddStore.dddstore.domain.staff.commands.CreateStaffCommand;
import com.dddStore.dddstore.domain.staff.events.StaffCreated;
import com.dddStore.dddstore.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CreateStaffUseCaseTest {


    @Mock
    private EventsRepository eventsRepository;
    private CreateStaffUseCase createStaffUseCase;

    @BeforeEach
    void setup(){
        createStaffUseCase = new CreateStaffUseCase(eventsRepository);
    }

    @Test
    void successfulScenario(){

        CreateStaffCommand createStaffCommand = new CreateStaffCommand("StafID");
        StaffCreated staffCreated = new StaffCreated();
        staffCreated.setAggregateRootId("StafID");//primitive types
        Mockito.when(eventsRepository.saveEvent(ArgumentMatchers.any(StaffCreated.class)))
                .thenAnswer(invocationOnMock -> {
                    return invocationOnMock.getArgument(0);
                });
        List<DomainEvent> domainEventList = createStaffUseCase.apply(createStaffCommand);

        Assertions.assertEquals(1,domainEventList.size());
        //Assertions.assertEquals("testId",domainEventList.get(0).aggregateRootId());

    }



}