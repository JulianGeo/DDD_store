package com.dddStore.dddstore.domain.saleOrder.values;

import com.dddStore.dddstore.generic.ValueObject;

import java.util.Objects;

public class Total implements ValueObject<Double> {

    private final Double value;

    public Total(Double value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Double value() {
        return value;
    }
}

