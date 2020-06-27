import test.design.patterns.creational.abstractFactory.KorusProjectRunner;
import test.design.patterns.creational.builder.BuilderRunner;
import test.design.patterns.creational.factory.FactoryRunner;
import test.design.patterns.creational.prototype.PrototypeRunner;
import test.design.patterns.creational.singleton.SingletonRunner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting application the design patterns ...");

        String data[] = {""};

        SingletonRunner.main(data);
        PrototypeRunner.main(data);
        BuilderRunner.main(data);
        FactoryRunner.main(data);
        KorusProjectRunner.main(data);

    }
}
