package test.design.patterns.structural.flyweight;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import test.design.patterns.structural.facade.FacadeRunner;

import java.util.ArrayList;
import java.util.List;

public class FlyWeightRunner {

    public static final Logger log = LogManager.getLogger(FacadeRunner.class);

    public static void main(String args) {
        log.info(args);

        List<Motorist> list = new ArrayList<Motorist>();

        CarFactory factory = new CarFactory();
        list.add(new Motorist("Shumaher", 57, factory.getCar("niva")));
        list.add(new Motorist("Nikolay Margin", 57, factory.getCar("lada")));
        list.add(new Motorist("Zed Epling", 57, factory.getCar("mercedes")));

        for (Motorist motorist :list) {
            motorist.getCar().beep();
            motorist.getCar().move();
        }

        log.info(args);
    }
}
