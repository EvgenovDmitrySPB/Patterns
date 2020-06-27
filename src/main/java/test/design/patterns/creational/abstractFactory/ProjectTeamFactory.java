package test.design.patterns.creational.abstractFactory;

public interface ProjectTeamFactory {
    Developer getFirstDeveloper();
    Developer getSecondDeveloper();
    ProjectManager getProjectManager();
    Tester getTester();
}
