package com.dddStore.dddstore.domain.saleOrder.commands;

import com.dddStore.dddstore.generic.Command;

public class AddSalesmanCommand extends Command {
    private String saleOrderID;
    private String salesmanID;

    public AddSalesmanCommand() {
    }

    public AddSalesmanCommand(String saleOrderID, String salesmanID) {
        this.saleOrderID = saleOrderID;
        this.salesmanID = salesmanID;
    }

    public String getSaleOrderID() {
        return saleOrderID;
    }

    public void setSaleOrderID(String saleOrderID) {
        this.saleOrderID = saleOrderID;
    }

    public String getSalesmanID() {
        return salesmanID;
    }

    public void setSalesmanID(String salesmanID) {
        this.salesmanID = salesmanID;
    }
}
