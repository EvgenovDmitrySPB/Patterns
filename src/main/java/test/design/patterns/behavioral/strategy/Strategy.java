package test.design.patterns.behavioral.strategy;

import java.math.BigDecimal;

public interface Strategy {
    BigDecimal execute(BigDecimal a, BigDecimal b);
}
