package test.design.patterns.structural.adapter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import test.design.patterns.creational.abstractFactory.KorusProjectRunner;

public class AdapterRunner {

    public static final Logger log = LogManager.getLogger(KorusProjectRunner.class);

    public static void main(String args) {
        log.info(args);

        Client client = new AdapterMarketToClient();

        client.buy();
        client.getBonus();
        client.sell();

        log.info(args);
    }
}
