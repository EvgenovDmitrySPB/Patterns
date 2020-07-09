package test.design.patterns.structural.composite;

import lombok.Data;

@Data
public class Shooter implements Soldier {

    private String name;

    public Shooter(String name) {
        this.name = name;
    }

    public void action() {
        System.out.println("Shooter " + this.name + " is shoot on enemy more...");
    }
}
