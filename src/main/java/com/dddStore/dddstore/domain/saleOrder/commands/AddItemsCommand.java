package com.dddStore.dddstore.domain.saleOrder.commands;

import com.dddStore.dddstore.domain.saleOrder.values.SaleOrderID;
import com.dddStore.dddstore.generic.Command;

public class AddItemsCommand extends Command {
    private String saleOrderID;
    private String itemID;
    private Integer amount;

    public AddItemsCommand() {
    }

    public AddItemsCommand(String saleOrderID, String itemID, Integer amount) {
        this.saleOrderID = saleOrderID;
        this.itemID = itemID;
        this.amount = amount;
    }

    public String getSaleOrderID() {
        return saleOrderID;
    }

    public void setSaleOrderID(String saleOrderID) {
        this.saleOrderID = saleOrderID;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
