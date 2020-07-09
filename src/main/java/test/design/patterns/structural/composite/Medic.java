package test.design.patterns.structural.composite;

import lombok.Data;

@Data
public class Medic implements Soldier {

    private String name;

    public Medic(String name) {
        this.name = name;
    }

    public void action() {
        System.out.println("Medic " + this.name + " is helping to the detachment...");
    }
}
