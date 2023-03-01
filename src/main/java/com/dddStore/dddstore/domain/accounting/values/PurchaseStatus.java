package com.dddStore.dddstore.domain.accounting.values;

import com.dddStore.dddstore.generic.ValueObject;

import java.util.Objects;

public class PurchaseStatus implements ValueObject<String> {

    private final String value;

    public PurchaseStatus(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}