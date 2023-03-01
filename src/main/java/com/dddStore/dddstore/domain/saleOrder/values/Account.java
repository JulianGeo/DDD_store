package com.dddStore.dddstore.domain.saleOrder.values;

import com.dddStore.dddstore.generic.ValueObject;

import java.util.Objects;

public class Account implements ValueObject<Account.Props> {

    private final User user;
    private final Password password;

    public Account(User user, Password password) {
        this.user = Objects.requireNonNull(user);
        this.password =Objects.requireNonNull(password);
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public User user() {
                return user;
            }

            @Override
            public Password password() {
                return password;
            }
        };
    }

    public interface Props {
        User user();
        Password password();
    }
}
