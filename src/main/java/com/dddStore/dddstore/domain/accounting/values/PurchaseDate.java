package com.dddStore.dddstore.domain.accounting.values;

import com.dddStore.dddstore.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class PurchaseDate implements ValueObject<LocalDate> {

    private LocalDate value;

    public PurchaseDate(LocalDate value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public LocalDate value() {
        return value;
    }
}