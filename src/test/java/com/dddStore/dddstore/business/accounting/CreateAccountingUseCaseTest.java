package com.dddStore.dddstore.business.accounting;

import com.dddStore.dddstore.business.commons.EventsRepository;
import com.dddStore.dddstore.business.inventory.CreateInventoryUseCase;
import com.dddStore.dddstore.domain.accounting.commands.CreateAccountingCommand;
import com.dddStore.dddstore.domain.accounting.events.AccountingCreated;
import com.dddStore.dddstore.domain.inventory.commands.CreateInventoryCommand;
import com.dddStore.dddstore.domain.inventory.events.InventoryCreated;
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
class CreateAccountingUseCaseTest {


    @Mock
    private EventsRepository eventsRepository;
    private CreateAccountingUseCase createAccountingUseCase;

    @BeforeEach
    void setup(){
        createAccountingUseCase = new CreateAccountingUseCase(eventsRepository);
    }

    @Test
    void successfulScenario(){

        CreateAccountingCommand createAccountingCommand = new CreateAccountingCommand("AccountingID");
        AccountingCreated accountingCreated = new AccountingCreated();
        accountingCreated.setAggregateRootId("AccountingID");//primitive types
        Mockito.when(eventsRepository.saveEvent(ArgumentMatchers.any(AccountingCreated.class)))
                .thenAnswer(invocationOnMock -> {
                    return invocationOnMock.getArgument(0);
                });
        List<DomainEvent> domainEventList = createAccountingUseCase.apply(createAccountingCommand);

        Assertions.assertEquals(1,domainEventList.size());
        //Assertions.assertEquals("testId",domainEventList.get(0).aggregateRootId());

    }

}