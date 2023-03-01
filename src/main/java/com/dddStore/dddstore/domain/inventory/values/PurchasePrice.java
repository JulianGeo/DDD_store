package com.dddStore.dddstore.domain.inventory.values;

import com.dddStore.dddstore.generic.ValueObject;

import java.util.Objects;

public class PurchasePrice implements ValueObject<Double> {

    private final Double value;

    public PurchasePrice(Double value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Double value() {
        return value;
    }
}