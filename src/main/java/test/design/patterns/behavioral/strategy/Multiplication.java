package test.design.patterns.behavioral.strategy;

import java.math.BigDecimal;

public class Multiplication implements Strategy {
    @Override
    public BigDecimal execute(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }
}
