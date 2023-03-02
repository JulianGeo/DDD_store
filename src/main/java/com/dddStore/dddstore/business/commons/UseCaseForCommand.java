package com.dddStore.dddstore.business.commons;

import com.dddStore.dddstore.generic.Command;
import com.dddStore.dddstore.generic.DomainEvent;

import java.util.List;

public interface UseCaseForCommand <T extends Command>{

    List<DomainEvent> apply(T command);

}