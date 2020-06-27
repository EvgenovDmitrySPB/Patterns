package test.design.patterns.creational.abstractFactory.sberbank;

import test.design.patterns.creational.abstractFactory.Developer;
import test.design.patterns.creational.abstractFactory.ProjectManager;
import test.design.patterns.creational.abstractFactory.ProjectTeamFactory;
import test.design.patterns.creational.abstractFactory.Tester;

public class SberTeamFactory implements ProjectTeamFactory {
    public Developer getFirstDeveloper() {
        return new JavaSberDeveloper();
    }

    public Developer getSecondDeveloper() {
        return new JsSberDeveloper();
    }

    public ProjectManager getProjectManager() {
        return new SberPm();
    }

    public Tester getTester() {
        return new QaSberTester();
    }
}
