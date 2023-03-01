package com.dddStore.dddstore.domain.accounting.values;

import com.dddStore.dddstore.generic.Identity;

public class AccountingID extends Identity {

    public AccountingID() {
    }

    private AccountingID(String accountingID) {
        super(accountingID);
    }

    public static AccountingID of (String accountingID){
        return new AccountingID(accountingID);
    }
}