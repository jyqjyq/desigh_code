package com.jyq.strategy.optimize;

public class Client {
    public static void main(String[] args) {
        DiscountContext context = new DiscountContext();

        // 使用固定折扣策略
        context.setDiscountStrategy(new FixedDiscountStrategy());
        double priceAfterFixedDiscount = context.calculateDiscount(100);
        System.out.println("Price after fixed discount: " + priceAfterFixedDiscount);

        // 使用百分比折扣策略
        context.setDiscountStrategy(new PercentageDiscountStrategy());
        double priceAfterPercentageDiscount = context.calculateDiscount(100);
        System.out.println("Price after percentage discount: " + priceAfterPercentageDiscount);

        // 使用半价折扣策略
        context.setDiscountStrategy(new HalfPriceDiscountStrategy());
        double priceAfterHalfPriceDiscount = context.calculateDiscount(100);
        System.out.println("Price after half price discount: " + priceAfterHalfPriceDiscount);

        // 使用VIP折扣策略
        context.setDiscountStrategy(new VipDiscountStrategy());
        double priceAfterVipDiscount = context.calculateDiscount(100);
        System.out.println("Price after VIP discount: " + priceAfterVipDiscount);

        // 没有优惠券
        context.setDiscountStrategy(new NoDiscountStrategy());
        double priceWithoutDiscount = context.calculateDiscount(100);
        System.out.println("Price without discount: " + priceWithoutDiscount);
    }
}