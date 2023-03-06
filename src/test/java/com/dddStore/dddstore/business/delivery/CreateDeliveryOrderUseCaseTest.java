package com.dddStore.dddstore.business.delivery;

import com.dddStore.dddstore.business.commons.EventsRepository;
import com.dddStore.dddstore.business.staff.CreateStaffUseCase;
import com.dddStore.dddstore.domain.delivery.commands.CreateDeliveryOrderCommand;
import com.dddStore.dddstore.domain.delivery.events.DeliveryOrderCreated;
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
class CreateDeliveryOrderUseCaseTest {

    @Mock
    private EventsRepository eventsRepository;
    private CreateDeliveryOrderUseCase createDeliveryOrderUseCase;

    @BeforeEach
    void setup(){
        createDeliveryOrderUseCase = new CreateDeliveryOrderUseCase(eventsRepository);
    }

    @Test
    void successfulScenario(){

        CreateDeliveryOrderCommand createDeliveryOrderCommand = new CreateDeliveryOrderCommand("DeliveryID");
        DeliveryOrderCreated deliveryOrderCreated = new DeliveryOrderCreated();
        deliveryOrderCreated.setAggregateRootId("DeliveryID");//primitive types
        Mockito.when(eventsRepository.saveEvent(ArgumentMatchers.any(DeliveryOrderCreated.class)))
                .thenAnswer(invocationOnMock -> {
                    return invocationOnMock.getArgument(0);
                });
        List<DomainEvent> domainEventList = createDeliveryOrderUseCase.apply(createDeliveryOrderCommand);

        Assertions.assertEquals(1,domainEventList.size());
        //Assertions.assertEquals("testId",domainEventList.get(0).aggregateRootId());

    }
}