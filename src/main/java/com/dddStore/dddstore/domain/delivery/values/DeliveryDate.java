package com.dddStore.dddstore.domain.delivery.values;

import com.dddStore.dddstore.domain.inventory.values.Price;
import com.dddStore.dddstore.domain.inventory.values.PurchasePrice;
import com.dddStore.dddstore.domain.inventory.values.SalePrice;
import com.dddStore.dddstore.domain.saleOrder.values.SaleOrderID;
import com.dddStore.dddstore.generic.ValueObject;


public class DeliveryDate implements ValueObject<DeliveryDate.Props>{
    private SaleOrderID saleOrderID;
    private DateD dateD;

    public DeliveryDate(SaleOrderID saleOrderID, DateD dateD) {
        this.saleOrderID = saleOrderID;
        this.dateD = dateD;
    }

    @Override
    public DeliveryDate.Props value() {
        return new DeliveryDate.Props() {
            @Override
            public SaleOrderID saleOrderID() {
                return saleOrderID;
            }

            @Override
            public DateD dateD() {
                return dateD;
            }
        };
    }

    public interface Props {
        SaleOrderID saleOrderID();
        DateD dateD();
    }

}