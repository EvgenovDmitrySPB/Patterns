package test.design.patterns.structural.composite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import test.design.patterns.structural.bridge.BridgeRunner;

public class CompositeRunner {

    public static final Logger log = LogManager.getLogger(BridgeRunner.class);

    public static void main(String args) {
        log.info(args);

        Detachment detachment = new Detachment();
        detachment.addSoldier(new Sniper("Ivan Rostov"));
        detachment.addSoldier(new Medic("Elena Andreenko"));
        detachment.addSoldier(new Shooter("Hard Jo"));
        detachment.addSoldier(new Shooter("Kianu Rivz"));

        detachment.atack();

        log.info(args);
    }
}
