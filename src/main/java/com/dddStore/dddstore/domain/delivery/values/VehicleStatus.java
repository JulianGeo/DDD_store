package com.dddStore.dddstore.domain.delivery.values;

import com.dddStore.dddstore.generic.ValueObject;

import java.util.Objects;

public class VehicleStatus implements ValueObject<String> {

    private String value;

    public VehicleStatus(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}