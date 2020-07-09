package test.design.patterns.creational.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SingletonRunner {

    public static final Logger log = LogManager.getLogger(SingletonRunner.class);

    public static void main(String args) {
        log.info(args);

        Singleton singleton = Singleton.getSingleton();
        singleton.setLogFile("log 1");
        singleton.setLogFile("log 2");
        singleton.setLogFile("log 3");
        singleton.getLogFile();

        log.info(args);
    }
}
