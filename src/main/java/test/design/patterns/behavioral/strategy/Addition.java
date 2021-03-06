package test.design.patterns.behavioral.strategy;

import java.math.BigDecimal;

public class Addition implements Strategy {
    @Override
    public BigDecimal execute(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
}
