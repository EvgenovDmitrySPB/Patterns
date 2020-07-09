package test.design.patterns.structural.bridge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BridgeRunner {

    public static final Logger log = LogManager.getLogger(BridgeRunner.class);

    public static void main(String args) {

        log.info(args);

        Salon[] salon = {
                new AirService(new Painter()),
                new CarService(new Bellini())
        };

        for (Salon current : salon) {
            current.draw();
        }

        log.info(args);
    }
}
