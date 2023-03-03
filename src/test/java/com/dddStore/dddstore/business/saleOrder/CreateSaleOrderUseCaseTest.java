package com.dddStore.dddstore.business.saleOrder;

import com.dddStore.dddstore.business.commons.EventsRepository;
import com.dddStore.dddstore.business.staff.CreateStaffUseCase;
import com.dddStore.dddstore.domain.saleOrder.commands.CreateSaleOrderCommand;
import com.dddStore.dddstore.domain.saleOrder.events.SaleOrderCreated;
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

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CreateSaleOrderUseCaseTest {

    @Mock
    private EventsRepository eventsRepository;
    private CreateSaleOrderUseCase createSaleOrderUseCase;

    @BeforeEach
    void setup(){
        createSaleOrderUseCase = new CreateSaleOrderUseCase(eventsRepository);
    }

    @Test
    void successfulScenario(){

        CreateSaleOrderCommand createSaleOrderCommand = new CreateSaleOrderCommand("SaleOrderID", LocalDate.of(1995,2,3));
        SaleOrderCreated saleOrderCreated = new SaleOrderCreated("SaleOrderID");
        saleOrderCreated.setAggregateRootId("SaleOrderID");//primitive types
        Mockito.when(eventsRepository.saveEvent(ArgumentMatchers.any(SaleOrderCreated.class)))
                .thenAnswer(invocationOnMock -> {
                    return invocationOnMock.getArgument(0);
                });
        List<DomainEvent> domainEventList = createSaleOrderUseCase.apply(createSaleOrderCommand);

        Assertions.assertEquals(1,domainEventList.size());
        //Assertions.assertEquals("testId",domainEventList.get(0).aggregateRootId());

    }
}