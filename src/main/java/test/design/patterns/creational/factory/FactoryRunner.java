package test.design.patterns.creational.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FactoryRunner {

    public static final Logger log = LogManager.getLogger(FactoryRunner.class);

    public static void main(String args) {
        log.info(args);

        DeveloperFactory factory = new JavaDeveloperFactory();
        Developer developer = factory.createDeveloper();

        developer.writeCode();

        log.info(args);
    }
}
