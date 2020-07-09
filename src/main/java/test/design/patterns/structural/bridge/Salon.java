package test.design.patterns.structural.bridge;

public abstract class Salon {

    protected Drawing drawing;

    protected Salon(Drawing drawing) {
        this.drawing = drawing;
    }

    public abstract void draw();
}
