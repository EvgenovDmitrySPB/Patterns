package test.design.patterns.behavioral.memento;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MementoRunner {

    public static final Logger log = LogManager.getLogger(MementoRunner.class);

    public static void main(String args) {
        log.info(args);

        Calendar calendar = new GregorianCalendar(2009, 2, 25);
        Work work = new Work(calendar.getTime(), "Ivan Shishkov", "IEA", "Moscow, Elabush street, 20", BigDecimal.valueOf(15000));

        System.out.println("Save hystory wirh first work: " + work.toString());
        Save save1 = work.save();

        System.out.println("Change work #1");

        calendar.set(2015, 5, 12);

        work.setDateStart(calendar.getTime());
        work.setCompany("AvasProm");
        work.setAddress("Riazan, Bluhera street, 124");
        work.setSalary(BigDecimal.valueOf(26000));
        Save save2 = work.save();

        System.out.println("Show new work: " + work.toString());
        work.toString();

        work.load(save1);

        System.out.println("Show old work #1: " + work.toString());
        work.toString();

        System.out.println("Change work #2");

        calendar.set(2018, 3, 04);

        work.setDateStart(calendar.getTime());
        work.setCompany("Uzmoto");
        work.setAddress("Kazan, Airat's street, 14");
        work.setSalary(BigDecimal.valueOf(38000));

        System.out.println("Show new work: " + work.toString());
        work.toString();

        work.load(save2);
        System.out.println("Show old work #2: " + work.toString());
        work.toString();

        log.info(args);
    }
}
