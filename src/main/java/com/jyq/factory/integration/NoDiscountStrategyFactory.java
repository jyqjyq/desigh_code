package com.jyq.factory.integration;

import com.jyq.strategy.optimize.DiscountStrategy;
import com.jyq.strategy.optimize.NoDiscountStrategy;

public class NoDiscountStrategyFactory implements DiscountStrategyFactory {
    @Override
    public DiscountStrategy createDiscountStrategy() {
        return new NoDiscountStrategy();
    }
}