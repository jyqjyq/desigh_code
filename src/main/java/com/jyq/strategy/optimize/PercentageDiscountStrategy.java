package com.jyq.strategy.optimize;

public class PercentageDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        // 90% 折扣
        return price * 0.9;
    }
}
