package com.dddStore.dddstore.domain.staff.values;

import com.dddStore.dddstore.generic.ValueObject;

import java.util.Objects;

public class Password implements ValueObject<String> {

    private final String value;

    public Password(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return null;
    }
}
