package com.dddStore.dddstore.domain.sharedValues;

import com.dddStore.dddstore.generic.ValueObject;

import java.util.Objects;

public class Location implements ValueObject<Location.Props> {

    private final Address address;
    private final Coordinates coordinates;

    public Location(Address address, Coordinates coordinates) {
        this.address = Objects.requireNonNull(address);
        this.coordinates = Objects.requireNonNull(coordinates);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public Address address() {
                return address;
            }
            @Override
            public Coordinates coordinates() {
                return coordinates;
            }
        };
    }

    public interface Props {
        Address address();
        Coordinates coordinates();
    }
}
