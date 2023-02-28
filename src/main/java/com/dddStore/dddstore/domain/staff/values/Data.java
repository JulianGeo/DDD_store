package com.dddStore.dddstore.domain.staff.values;

import com.dddStore.dddstore.generic.ValueObject;

public class Data implements ValueObject<Data.Props> {

    private final PersonalID personalID;
    private final Name name;
    private final Email email;
    private final Phone phone;

    public Data(PersonalID personalID, Name name, Email email, Phone phone) {
        this.personalID = personalID;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public PersonalID personalID() {
                return personalID;
            }

            @Override
            public Name name() {
                return name;
            }

            @Override
            public Email email() {
                return email;
            }

            @Override
            public Phone phone() {
                return phone;
            }
        };
    }


    public interface Props {

        PersonalID personalID();
        Name name();
        Email email();
        Phone phone();

    }
}
