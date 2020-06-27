package test.design.patterns.creational.builder;

import lombok.Data;

@Data
public class Car {
    private String name;
    private Brand brand;
    private String vin;
    private Integer age;
    private Integer numberSeats;
}
