package com.dddStore.dddstore.domain.saleOrder.values;

import com.dddStore.dddstore.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class DateS  implements ValueObject<LocalDate> {

    private LocalDate value;

    public DateS(LocalDate value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public LocalDate value() {
        return value;
    }
}