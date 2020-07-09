package test.design.patterns.structural.bridge;

public class CarService extends Salon {

    protected CarService(Drawing drawing) {
        super(drawing);
    }

    @Override
    public void draw() {
        System.out.println("CarService draw in progress ... ");
        drawing.drawBlue();
        drawing.drawYellow();
    }
}
