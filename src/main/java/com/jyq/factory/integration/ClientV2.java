package com.jyq.factory.integration;

public class ClientV2 {
    public static void main(String[] args) {
        DiscountContext context = new DiscountContext();

        // 使用固定折扣策略
        DiscountStrategyFactory fixedDiscountFactory = new FixedDiscountStrategyFactory();
        context.setDiscountStrategy(fixedDiscountFactory.createDiscountStrategy());
        double priceAfterFixedDiscount = context.calculateDiscount(100);
        System.out.println("Price after fixed discount: " + priceAfterFixedDiscount);

        // 使用百分比折扣策略
        DiscountStrategyFactory percentageDiscountFactory = new PercentageDiscountStrategyFactory();
        context.setDiscountStrategy(percentageDiscountFactory.createDiscountStrategy());
        double priceAfterPercentageDiscount = context.calculateDiscount(100);
        System.out.println("Price after percentage discount: " + priceAfterPercentageDiscount);

        // 使用半价折扣策略
        DiscountStrategyFactory halfPriceDiscountFactory = new HalfPriceDiscountStrategyFactory();
        context.setDiscountStrategy(halfPriceDiscountFactory.createDiscountStrategy());
        double priceAfterHalfPriceDiscount = context.calculateDiscount(100);
        System.out.println("Price after half price discount: " + priceAfterHalfPriceDiscount);

        // 使用VIP折扣策略
        DiscountStrategyFactory vipDiscountFactory = new VipDiscountStrategyFactory();
        context.setDiscountStrategy(vipDiscountFactory.createDiscountStrategy());
        double priceAfterVipDiscount = context.calculateDiscount(100);
        System.out.println("Price after VIP discount: " + priceAfterVipDiscount);

        // 没有优惠券
        DiscountStrategyFactory noDiscountFactory = new NoDiscountStrategyFactory();
        context.setDiscountStrategy(noDiscountFactory.createDiscountStrategy());
        double priceWithoutDiscount = context.calculateDiscount(100);
        System.out.println("Price without discount: " + priceWithoutDiscount);
    }
}
