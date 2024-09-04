package com.jyq.strategy.optimize;

public class DiscountContext {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount(double price) {
        return discountStrategy.applyDiscount(price);
    }
}