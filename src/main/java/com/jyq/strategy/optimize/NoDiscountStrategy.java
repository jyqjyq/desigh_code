package com.jyq.strategy.optimize;

public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        // 没有优惠券
        return price;
    }
}