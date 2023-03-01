package com.dddStore.dddstore.domain.delivery.values;

import com.dddStore.dddstore.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class ExpirationDate implements ValueObject<LocalDate> {

    private LocalDate value;

    public ExpirationDate(LocalDate value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public LocalDate value() {
        return value;
    }
}