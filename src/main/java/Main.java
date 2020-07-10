import lombok.extern.log4j.Log4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import test.design.patterns.creational.abstractFactory.KorusProjectRunner;
import test.design.patterns.creational.builder.BuilderRunner;
import test.design.patterns.creational.factory.FactoryRunner;
import test.design.patterns.creational.prototype.PrototypeRunner;
import test.design.patterns.creational.singleton.SingletonRunner;
import test.design.patterns.structural.adapter.AdapterRunner;
import test.design.patterns.structural.bridge.BridgeRunner;
import test.design.patterns.structural.composite.CompositeRunner;
import test.design.patterns.structural.decorator.DecoratorRunner;

@Log4j
public class Main {

    public static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        log.info("Starting application the design patterns ...");

        String data[] = {""};

        SingletonRunner.main("******** pattern Sungleton ****************");
        PrototypeRunner.main("******** pattern Prototype ****************");
        BuilderRunner.main("******** pattern Builder ****************");
        FactoryRunner.main("******** pattern Factory ****************");
        KorusProjectRunner.main("******** pattern AbstractFactory ****************");

        AdapterRunner.main("******** pattern Adapter ****************");
        BridgeRunner.main("******** pattern Bridge ****************");
        CompositeRunner.main("******** pattern Composite ****************");
        DecoratorRunner.main("******** pattern Decorator ****************");
    }
}
