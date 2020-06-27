package test.design.patterns.creational.abstractFactory;

import test.design.patterns.creational.abstractFactory.korus.*;

public class KorusProjectRunner {
    public static void main(String[] args) {
        System.out.println("******** pattern AbstractFactory team korus ****************");
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

        System.out.println("******** end of pattern AbstractFactory team korus ****************");
    }
}
