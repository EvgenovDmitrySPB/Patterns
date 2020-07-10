package test.design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private static final Map<String, Car> cars = new HashMap<String, Car>();

    public Car getCar(String model) {
        Car car = cars.get(model);

        if (car == null) {
            switch (model) {
                case "mercedes":
                    car = new Mercedes();
                    break;
                case "niva":
                    car = new Niva();
                    break;
                case "lada":
                    car = new Lada();
            }
            cars.put(model, car);
        }
        return car;
    }
}
