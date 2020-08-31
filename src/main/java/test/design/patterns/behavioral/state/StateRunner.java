package test.design.patterns.behavioral.state;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StateRunner {
    public static final Logger log = LogManager.getLogger(StateRunner.class);

    public static void main(String args) {
        log.info(args);
        Document document = new Document();
        document.conducted();
        document.unConducted();
        document.makeDeleteFlag();
        document.create();

        log.info(args);
    }
}

