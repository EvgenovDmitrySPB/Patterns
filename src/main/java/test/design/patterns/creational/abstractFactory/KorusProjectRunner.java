package test.design.patterns.creational.abstractFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import test.design.patterns.creational.abstractFactory.korus.*;

public class KorusProjectRunner {

    public static final Logger log = LogManager.getLogger(KorusProjectRunner.class);

    public static void main(String args) {
        log.info(args);

        ProjectTeamFactory teamFactory = new KorusTeamFactory();
        Developer developer1 = new JavaDeveloper();
        Developer developer2 = new JsDeveloper();
        Tester tester = new QaTester();
        ProjectManager projectManager = new Pm();

        System.out.println("Creating korus command");

        developer1.writeCode();
        developer2.writeCode();
        tester.testCode();
        projectManager.manageProject();

        log.info(args);
    }
}
