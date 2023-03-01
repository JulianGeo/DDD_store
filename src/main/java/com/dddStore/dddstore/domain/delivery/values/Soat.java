package com.dddStore.dddstore.domain.delivery.values;

import com.dddStore.dddstore.generic.ValueObject;

import java.util.Objects;

public class Soat implements ValueObject<Soat.Props> {

    private ExpirationDate expirationDate;

    public Soat(ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public Soat.Props value() {
        return new Soat.Props() {
            @Override
            public ExpirationDate expirationDate() {
                return expirationDate;
            }
        };
    }


    public interface Props {
        ExpirationDate expirationDate();

    }
}

