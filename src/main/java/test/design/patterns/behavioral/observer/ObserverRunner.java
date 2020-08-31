package test.design.patterns.behavioral.observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ObserverRunner {

    public static final Logger log = LogManager.getLogger(ObserverRunner.class);

    public static void main(String args) {
        log.info(args);

        Subscriber subscriber1 = new Alfa();
        Subscriber subscriber2 = new Fin();
        Subscriber subscriber3 = new Sber();

        NysePublisher publisher = new NysePublisher();
        publisher.addSubscriber(subscriber1);
        publisher.addSubscriber(subscriber2);
        publisher.addSubscriber(subscriber3);

        System.out.println("Nyse public quotes for subscriber's");
        publisher.addQuote("Weibos 38.525, Rokul 172.815, Transoceand Ltd 1.345");

        System.out.println("Delete one of subscriber and public quotes");
        publisher.deleteSubscriber(subscriber3);

        publisher.addQuote("Wynna Resorts 91.505, Cotys 3.785, Macerichw 7.095");

        log.info(args);

    }
}
