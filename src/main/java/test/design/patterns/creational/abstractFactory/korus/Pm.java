package test.design.patterns.creational.abstractFactory.korus;

import test.design.patterns.creational.abstractFactory.ProjectManager;

public class Pm implements ProjectManager {
    public void manageProject() {
        System.out.println("Pm manages korus project...");
    }
}
