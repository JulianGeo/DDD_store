package com.dddStore.dddstore.domain.sharedValues;

import com.dddStore.dddstore.generic.ValueObject;

import java.util.Objects;

public class Address implements ValueObject<String> {

    private String value;

    public Address(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}
