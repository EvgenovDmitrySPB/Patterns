package test.design.patterns.creational.factory;

public class FactoryRunner {
    public static void main(String[] args) {
        System.out.println("******** pattern Factory ****************");
        DeveloperFactory factory = new JavaDeveloperFactory();
        Developer developer = factory.createDeveloper();

        developer.writeCode();
        System.out.println("******** pattern Factory ****************");
    }
}
