package test.design.patterns.behavioral.strategy;

import java.math.BigDecimal;

public class Division implements Strategy {
    @Override
    public BigDecimal execute(BigDecimal a, BigDecimal b) {
        return a.divide(b);
    }
}
