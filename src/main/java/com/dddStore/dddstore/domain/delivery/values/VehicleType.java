package com.dddStore.dddstore.domain.delivery.values;

import com.dddStore.dddstore.generic.ValueObject;

import java.util.Objects;

public class VehicleType implements ValueObject<String> {

    private String value;

    public VehicleType(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}

