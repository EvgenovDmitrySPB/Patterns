package test.design.patterns.behavioral.chain;

public class ButtonComponent extends Component {
    public ButtonComponent(TypesCo typeComponent) {
        super(typeComponent);
    }

    @Override
    protected void drawComponent(String message) {
        System.out.println("Component " + super.getTypeComponent().getTitle() + " draw: " + message);
    }
}
