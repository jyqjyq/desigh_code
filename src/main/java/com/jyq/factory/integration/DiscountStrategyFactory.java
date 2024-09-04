package com.jyq.factory.integration;

import com.jyq.strategy.optimize.DiscountStrategy;

public interface DiscountStrategyFactory {
    DiscountStrategy createDiscountStrategy();
}
