package test.design.patterns.structural.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FacadeRunner {

    public static final Logger log = LogManager.getLogger(FacadeRunner.class);

    public static void main(String args) {

        log.info(args);

        Hr hr = new Hr();
        Director director = new Director();
        Security security = new Security();

        Company department = new Company(hr, director, security);

        List<Candidate> candidates = new ArrayList<Candidate>();
        candidates.add(new Candidate("Boris Eltsin", BigDecimal.valueOf(1500l), 15.3d, true, true));
        candidates.add(new Candidate("John Michael Cane", BigDecimal.valueOf(500l), 5.2d, true, false));
        candidates.add(new Candidate("Margaret Tetcher", BigDecimal.valueOf(1000l), 2.3d, true, false));

        for (Candidate current : candidates) {
            if (department.getJob(current)) {
                System.out.println("+ Greeting '" + current.getName() + "' you have a job");
            } else {
                System.out.println("- " + current.getName() + " haven't a job");
            }
        }
        log.info(args);
    }
}
