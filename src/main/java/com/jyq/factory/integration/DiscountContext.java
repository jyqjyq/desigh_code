package com.jyq.factory.integration;

import com.jyq.strategy.optimize.DiscountStrategy;

public class DiscountContext {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount(double price) {
        return discountStrategy.applyDiscount(price);
    }
}