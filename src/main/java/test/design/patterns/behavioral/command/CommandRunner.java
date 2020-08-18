package test.design.patterns.behavioral.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import test.design.patterns.creational.abstractFactory.KorusProjectRunner;

public class CommandRunner {
    public static final Logger log = LogManager.getLogger(CommandRunner.class);

    public static void main(String args) {
        log.info(args);

        Api api = new Api();
        Analizer analizer = new Analizer(
                new Create(api),
                new Update(api),
                new FindById(api),
                new Delete(api)
        );

        analizer.create();
        analizer.update();
        analizer.findById();
        analizer.delete();

        log.info(args);
    }
}
