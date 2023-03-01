package com.dddStore.dddstore.domain.inventory.values;

import com.dddStore.dddstore.generic.ValueObject;

public class Price implements ValueObject<Price.Props> {
    private SalePrice salePrice;
    private PurchasePrice purchasePrice;

    public Price(SalePrice salePrice, PurchasePrice purchasePrice) {
        this.salePrice = salePrice;
        this.purchasePrice = purchasePrice;
    }

    @Override
    public Price.Props value() {
        return new Price.Props() {
            @Override
            public SalePrice salePrice() {
                return salePrice;
            }

            @Override
            public PurchasePrice purchasePrice() {
                return purchasePrice;
            }
        };
    }

    public interface Props {
        SalePrice salePrice();
        PurchasePrice purchasePrice();
    }
}
