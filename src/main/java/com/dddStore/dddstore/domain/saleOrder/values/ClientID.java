package com.dddStore.dddstore.domain.saleOrder.values;

import com.dddStore.dddstore.generic.Identity;

public class ClientID extends Identity {

    public ClientID() {
    }

    public ClientID(String clientID) {
        super(clientID);
    }

    public static ClientID of(String clientID){
        return new ClientID(clientID);
    }
}
