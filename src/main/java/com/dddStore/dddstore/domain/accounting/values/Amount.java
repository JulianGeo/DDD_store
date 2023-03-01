package com.dddStore.dddstore.domain.accounting.values;

import com.dddStore.dddstore.generic.ValueObject;

import java.util.Objects;

public class Amount implements ValueObject<Integer> {

    private Integer value;

    public Amount(Integer value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Integer value() {
        return value;
    }
}