package test.design.patterns.creational.builder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BuilderRunner {

    public static final Logger log = LogManager.getLogger(BuilderRunner.class);

    public static void main(String args) {
        log.info(args);

        CarBuilder builder = new CarBuilder();
        builder.reset();

        System.out.println(builder.getResult());

        builder.setAge(17);
        builder.setBrand(Brand.TOYOTA);
        builder.setVin("VMJLJLJK223LJJJLK4324");
        builder.setNumberSeats(4);

        Car car = builder.getResult();
        System.out.println(car);

        Director director = new Director(new CarBuilder());
        Car homeCar = director.constructHomeCar();
        Car sportCar = director.constructSportCar();

        System.out.println(homeCar);
        System.out.println(sportCar);

        log.info(args);
    }
}
