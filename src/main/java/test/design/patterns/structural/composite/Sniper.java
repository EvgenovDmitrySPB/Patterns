package test.design.patterns.structural.composite;

import lombok.Data;

@Data
public class Sniper implements Soldier {

    private String name;

    public Sniper(String name) {
        this.name = name;
    }

    public void action() {
        System.out.println("Sniper " + this.name + " shoot on the enemy...");
    }
}
