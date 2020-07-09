package test.design.patterns.structural.bridge;

public class AirService extends Salon {

    public AirService(Drawing drawing) {
        super(drawing);
    }

    @Override
    public void draw() {
        System.out.println("AirService draw in progress ... ");
        drawing.drawBlue();
        drawing.drawGreen();
    }
}
