package test.design.patterns.behavioral.strategy;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Context {
    private Strategy strategy;

    BigDecimal executeStrategy(BigDecimal a, BigDecimal b) {
        return strategy.execute(a, b);
    }
}
