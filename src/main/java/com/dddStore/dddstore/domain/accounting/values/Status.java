package com.dddStore.dddstore.domain.accounting.values;

import com.dddStore.dddstore.generic.ValueObject;

import java.util.Objects;

public class Status implements ValueObject<String> {

    private final String value;

    public Status(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}