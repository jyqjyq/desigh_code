package com.jyq.strategy.optimize;

public class HalfPriceDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        // 50% 折扣
        return price * 0.5;
    }
}
