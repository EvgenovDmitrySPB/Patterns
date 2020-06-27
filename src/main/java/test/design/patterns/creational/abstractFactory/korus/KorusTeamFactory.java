package test.design.patterns.creational.abstractFactory.korus;

import test.design.patterns.creational.abstractFactory.Developer;
import test.design.patterns.creational.abstractFactory.ProjectManager;
import test.design.patterns.creational.abstractFactory.ProjectTeamFactory;
import test.design.patterns.creational.abstractFactory.Tester;

public class KorusTeamFactory implements ProjectTeamFactory {
    public Developer getFirstDeveloper() {
        return new JavaDeveloper();
    }

    public Developer getSecondDeveloper() {
        return new JsDeveloper();
    }

    public ProjectManager getProjectManager() {
        return new Pm();
    }

    public Tester getTester() {
        return new QaTester();
    }
}
