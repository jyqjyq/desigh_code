package com.jyq.strategy.bad;

public class DiscountCalculator {
    public double calculateDiscount(String couponType, double price) {
        if ("FIXED".equals(couponType)) {
            return price - 10; // 固定折扣10元
        } else if ("PERCENTAGE".equals(couponType)) {
            return price * 0.9; // 90% 折扣
        } else if ("HALF_PRICE".equals(couponType)) {
            return price * 0.5; // 50% 折扣
        } else if ("VIP".equals(couponType)) {
            return price * 0.8; // VIP 80% 折扣
        } else {
            return price; // 没有优惠券
        }
    }
}
