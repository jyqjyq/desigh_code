package com.jyq.factory.integration;

import com.jyq.strategy.optimize.DiscountStrategy;
import com.jyq.strategy.optimize.PercentageDiscountStrategy;

public class PercentageDiscountStrategyFactory implements DiscountStrategyFactory {
    @Override
    public DiscountStrategy createDiscountStrategy() {
        return new PercentageDiscountStrategy();
    }
}