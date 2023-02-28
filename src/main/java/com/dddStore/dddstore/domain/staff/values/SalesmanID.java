package com.dddStore.dddstore.domain.staff.values;

import com.dddStore.dddstore.generic.Identity;

public class SalesmanID extends Identity {
    public SalesmanID() {
    }

    public SalesmanID(String salesmanID) {
        super(salesmanID);
    }

    public static SalesmanID of (String salesmanID){
        return new SalesmanID(salesmanID);
    }
}

