package com.example.solid.ocp;

public class GoodDiscountCalculator {
    private DiscountStrategy strategy;

    public GoodDiscountCalculator(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double price) {
        return strategy.calculate(price);
    }
}
