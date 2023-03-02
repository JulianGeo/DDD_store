package com.dddStore.dddstore.business.commons;

import com.dddStore.dddstore.generic.DomainEvent;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EventsRepository {

    DomainEvent saveEvent(DomainEvent event);

    List<DomainEvent> findByAggregatedRootId(String aggregatedRootId);

}