package test.design.patterns.structural.bridge;

public class Painter implements Drawing {

    public void drawBlue() {
        System.out.println("Painter is painting blue color ");
    }

    public void drawGreen() {
        System.out.println("Painter is painting green color ");
    }

    public void drawYellow() {
        System.out.println("Painter is painting yellow color ");
    }
}
