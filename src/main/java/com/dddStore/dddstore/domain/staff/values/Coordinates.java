package com.dddStore.dddstore.domain.staff.values;

import com.dddStore.dddstore.generic.ValueObject;

import java.util.Objects;

public class Coordinates implements ValueObject<String> {

    private final String value;

    public Coordinates(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}
