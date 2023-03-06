package com.dddStore.dddstore.business.inventory;

import com.dddStore.dddstore.business.commons.EventsRepository;
import com.dddStore.dddstore.business.staff.CreateStaffUseCase;
import com.dddStore.dddstore.domain.inventory.commands.CreateInventoryCommand;
import com.dddStore.dddstore.domain.inventory.events.InventoryCreated;
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
class CreateInventoryUseCaseTest {


    @Mock
    private EventsRepository eventsRepository;
    private CreateInventoryUseCase createInventoryUseCase;

    @BeforeEach
    void setup(){
        createInventoryUseCase = new CreateInventoryUseCase(eventsRepository);
    }

    @Test
    void successfulScenario(){

        CreateInventoryCommand createInventoryCommand = new CreateInventoryCommand("InventoryID");
        InventoryCreated inventoryCreated = new InventoryCreated();
        inventoryCreated.setAggregateRootId("InventoryID");//primitive types
        Mockito.when(eventsRepository.saveEvent(ArgumentMatchers.any(InventoryCreated.class)))
                .thenAnswer(invocationOnMock -> {
                    return invocationOnMock.getArgument(0);
                });
        List<DomainEvent> domainEventList = createInventoryUseCase.apply(createInventoryCommand);

        Assertions.assertEquals(1,domainEventList.size());
        //Assertions.assertEquals("testId",domainEventList.get(0).aggregateRootId());

    }

}