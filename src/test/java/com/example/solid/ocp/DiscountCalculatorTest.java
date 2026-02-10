package com.example.solid.ocp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DiscountCalculatorTest {

    @Test
    void shouldApplyRegularDiscount() {
        GoodDiscountCalculator calculator =
                new GoodDiscountCalculator(new RegularDiscount());

        double discount = calculator.calculate(100);

        assertEquals(10.0, discount);
    }

    @Test
    void shouldApplyVipDiscount() {
        GoodDiscountCalculator calculator =
                new GoodDiscountCalculator(new VipDiscount());

        double discount = calculator.calculate(100);

        assertEquals(20.0, discount);
    }
}
