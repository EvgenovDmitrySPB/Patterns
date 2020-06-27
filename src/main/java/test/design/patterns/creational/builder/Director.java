package test.design.patterns.creational.builder;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Director {
    private CarBuilder builder;

    public Car constructSportCar(){
        builder.reset();
        builder.setName("The Sport car");
        builder.setNumberSeats(2);
        builder.setVin("JLJJLJL1211");
        builder.setBrand(Brand.MERCEDES);
        builder.setAge(1);
        return builder.getResult();
    }

    public Car constructHomeCar(){
        builder.reset();
        builder.setName("The Home car");
        builder.setNumberSeats(4);
        builder.setVin("2231312FDFSDF");
        builder.setBrand(Brand.VOLGA);
        builder.setAge(15);
        return builder.getResult();
    }
}
