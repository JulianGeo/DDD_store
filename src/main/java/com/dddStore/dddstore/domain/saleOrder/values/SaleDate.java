package com.dddStore.dddstore.domain.saleOrder.values;

import com.dddStore.dddstore.generic.ValueObject;

public class SaleDate implements ValueObject<SaleDate.Props> {
    private SaleOrderID saleOrderID;
    private DateS date;

    public SaleDate(SaleOrderID saleOrderID, DateS date) {
        this.saleOrderID = saleOrderID;
        this.date = date;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public SaleOrderID saleOrderID() {
                return null;
            }

            @Override
            public DateS date() {
                return null;
            }
        };
    }


    public interface Props {
        SaleOrderID saleOrderID();
        DateS date();
    }
}
