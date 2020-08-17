package test.design.patterns.behavioral.chain;

public class CheckBoxComponent extends Component {
    public CheckBoxComponent(TypesCo typeComponent) {
        super(typeComponent);
    }

    @Override
    protected void drawComponent(String message) {
        System.out.println("Component " + super.getTypeComponent().getTitle() + " draw: " + message);
    }
}
