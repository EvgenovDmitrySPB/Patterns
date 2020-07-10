package test.design.patterns.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Motorist {
    private String name;
    private int age;
    private Car car;
}
