package com.jyq.strategy.optimize;

public class VipDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        // VIP 80% 折扣
        return price * 0.8;
    }
}