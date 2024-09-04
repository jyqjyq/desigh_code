package com.jyq.factory.integration;

import com.jyq.strategy.optimize.DiscountStrategy;
import com.jyq.strategy.optimize.VipDiscountStrategy;

public class VipDiscountStrategyFactory implements DiscountStrategyFactory {
    @Override
    public DiscountStrategy createDiscountStrategy() {
        return new VipDiscountStrategy();
    }
}