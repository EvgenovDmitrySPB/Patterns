package test.design.patterns.structural.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DecoratorRunner {

    public static final Logger log = LogManager.getLogger(DecoratorRunner.class);

    public static void main(String args) {

        log.info(args);

        Employee employee = new AirMechanic(new AutoMechanic(new AirMechanic(new AutoMechanic(new Mechanic()))));

        System.out.println(employee.working());
        System.out.println(employee.getSalary());

        log.info(args);

    }
}
