import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import test.design.patterns.behavioral.chain.ChainRunner;
import test.design.patterns.behavioral.command.CommandRunner;
import test.design.patterns.behavioral.iterator.IteratorRunner;
import test.design.patterns.behavioral.mediator.MediatorRunner;
import test.design.patterns.creational.abstractFactory.KorusProjectRunner;
import test.design.patterns.creational.builder.BuilderRunner;
import test.design.patterns.creational.factory.FactoryRunner;
import test.design.patterns.creational.prototype.PrototypeRunner;
import test.design.patterns.creational.singleton.SingletonRunner;
import test.design.patterns.structural.adapter.AdapterRunner;
import test.design.patterns.structural.bridge.BridgeRunner;
import test.design.patterns.structural.composite.CompositeRunner;
import test.design.patterns.structural.decorator.DecoratorRunner;
import test.design.patterns.structural.facade.FacadeRunner;
import test.design.patterns.structural.flyweight.FlyWeightRunner;
import test.design.patterns.structural.proxy.ProxyRunner;

@Log4j2
public class Main {

    public static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        log.info("Starting application the design patterns ...");
        int i = 0;
        SingletonRunner.main(i++ + " ******** pattern Singleton ****************");
        PrototypeRunner.main(i++ + " ******** pattern Prototype ****************");
        BuilderRunner.main(i++ + " ******** pattern Builder ****************");
        FactoryRunner.main(i++ + " ******** pattern Factory ****************");
        KorusProjectRunner.main(i++ + " ******** pattern AbstractFactory ****************");

        AdapterRunner.main(i++ + " ******** pattern Adapter ****************");
        BridgeRunner.main(i++ + " ******** pattern Bridge ****************");
        CompositeRunner.main(i++ + " ******** pattern Composite ****************");
        DecoratorRunner.main(i++ + " ******** pattern Decorator ****************");
        FacadeRunner.main(i++ + " ******** pattern Facade ****************");
        FlyWeightRunner.main(i++ + " ******** pattern FlyWeight ****************");
        ProxyRunner.main(i++ + " ******** pattern Proxy ****************");

        ChainRunner.main(i++ + " ******** pattern Chain ****************");
        CommandRunner.main(i++ + " ******** pattern Command ****************");
        IteratorRunner.main(i++ + " ******** pattern Iterator ****************");
        MediatorRunner.main(i++ + " ******** pattern Mediator ****************");
    }
}
