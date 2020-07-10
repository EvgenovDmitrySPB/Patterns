package test.design.patterns.structural.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ProxyRunner {

    public static final Logger log = LogManager.getLogger(ProxyRunner.class);

    public static void main(String args) {

        log.info(args);

        List<Database> databases = new ArrayList<>();
        databases.add(new ProxyPostgre("jdbc:postgresql://localhost:5432/test"));
        databases.add(new ProxyOracle("jdbc:oracle:thin:@localhost:1521:test"));

        for (Database database: databases) {
            System.out.println(database.select());
            System.out.println(database.insert());
            System.out.println(database.update());
            System.out.println(database.delete());
        }

        log.info(args);
    }
}
