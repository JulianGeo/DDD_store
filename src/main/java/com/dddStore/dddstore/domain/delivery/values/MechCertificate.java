package com.dddStore.dddstore.domain.delivery.values;

import com.dddStore.dddstore.generic.ValueObject;

import java.util.Objects;

public class MechCertificate implements ValueObject<String> {

    private final String value;

    public MechCertificate(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}