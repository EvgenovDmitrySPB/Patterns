package test.design.patterns.behavioral.mediator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class MediatorRunner {
    public static final Logger log = LogManager.getLogger(MediatorRunner.class);

    public static void main(String args) {
        log.info(args);

        AirportDispatcher dispatcher = new AirportDispatcher();

        Airplane airbus = new Airbus();
        Airplane tu = new TU();
        Airplane boeing = new Boeing();

        dispatcher.addPlane(airbus);
        dispatcher.addPlane(tu);
        dispatcher.addPlane(boeing);

        System.out.println("--------Getting messages:");
        List<String> listMessage = dispatcher.getMessage();
        for (String message : listMessage) {
            System.out.println(message);
        }
        System.out.println("-------Sending messages:");
        dispatcher.sendMessage("Sunny weather today");

        log.info(args);
    }
}
