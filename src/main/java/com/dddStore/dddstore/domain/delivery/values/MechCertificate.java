package com.dddStore.dddstore.domain.delivery.values;

import com.dddStore.dddstore.generic.ValueObject;

import java.util.Objects;

public class MechCertificate implements ValueObject<MechCertificate.Props> {

    private ExpirationDate expirationDate;

    public MechCertificate(ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public MechCertificate.Props value() {
        return new MechCertificate.Props() {
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