package com.jyq.factory.integration;

import com.jyq.strategy.optimize.DiscountStrategy;
import com.jyq.strategy.optimize.HalfPriceDiscountStrategy;

public class HalfPriceDiscountStrategyFactory implements DiscountStrategyFactory {
    @Override
    public DiscountStrategy createDiscountStrategy() {
        return new HalfPriceDiscountStrategy();
    }
}