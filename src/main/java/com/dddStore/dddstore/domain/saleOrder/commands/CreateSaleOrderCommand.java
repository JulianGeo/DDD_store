package com.dddStore.dddstore.domain.saleOrder.commands;

import com.dddStore.dddstore.generic.Command;

import java.time.LocalDate;

public class CreateSaleOrderCommand extends Command {
    private String saleOrderID;
    private LocalDate date;


    public CreateSaleOrderCommand() {
    }

    public CreateSaleOrderCommand(String saleOrderID, LocalDate date) {
        this.saleOrderID = saleOrderID;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getSaleOrderID() {
        return saleOrderID;
    }

    public void setSaleOrderID(String saleOrderID) {
        this.saleOrderID = saleOrderID;
    }

}
