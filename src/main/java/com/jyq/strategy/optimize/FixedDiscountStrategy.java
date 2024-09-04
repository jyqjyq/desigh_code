package com.jyq.strategy.optimize;

public class FixedDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        // 固定折扣10元
        return price - 10;
    }
}
