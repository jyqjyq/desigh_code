package com.jyq.factory.integration;

import com.jyq.strategy.optimize.DiscountStrategy;
import com.jyq.strategy.optimize.FixedDiscountStrategy;

public class FixedDiscountStrategyFactory implements DiscountStrategyFactory {
    @Override
    public DiscountStrategy createDiscountStrategy() {
        return new FixedDiscountStrategy();
    }
}
