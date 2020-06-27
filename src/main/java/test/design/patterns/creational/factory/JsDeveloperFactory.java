package test.design.patterns.creational.factory;

public class JsDeveloperFactory implements DeveloperFactory {
    public Developer createDeveloper() {
        return new JsDeveloper();
    }
}
