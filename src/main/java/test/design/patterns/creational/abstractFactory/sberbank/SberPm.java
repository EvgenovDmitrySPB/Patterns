package test.design.patterns.creational.abstractFactory.sberbank;

import test.design.patterns.creational.abstractFactory.ProjectManager;

public class SberPm implements ProjectManager {
    public void manageProject() {
        System.out.println("Pm manages korus project...");
    }
}
