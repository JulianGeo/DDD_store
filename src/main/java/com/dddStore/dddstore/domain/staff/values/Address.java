package com.dddStore.dddstore.domain.staff.values;

import com.dddStore.dddstore.generic.ValueObject;

import java.util.Objects;

public class Address implements ValueObject<String> {

    private final String value;

    public Address(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}
