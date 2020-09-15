package test.design.patterns.behavioral.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StrategyRunner {

    public static final Logger log = LogManager.getLogger(StrategyRunner.class);
    private static final String PACKET = "test.design.patterns.behavioral.strategy.";

    public static void main(String args) {
        log.info(args);

        List<Strategy> list = new ArrayList<>();
        list.add(new Addition());
        list.add(new Division());
        list.add(new Multiplication());
        list.add(new Substraction());

        BigDecimal a = BigDecimal.valueOf(10);
        BigDecimal b = BigDecimal.valueOf(40);

        System.out.println("Start executing ... a = " + a + " b = " + b);
        Context context = new Context();
        for (Strategy strategy : list) {
            context.setStrategy(strategy);
            System.out.println("Strategy: " + strategy.getClass().getName().replace(PACKET, "") + "(a,b) result:  " + context.executeStrategy(a, b));
        }

        log.info(args);
    }
}
