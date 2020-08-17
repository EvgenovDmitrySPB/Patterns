package test.design.patterns.behavioral.chain;

public class PanelComponent extends Component {

    public PanelComponent(TypesCo typeComponent) {
        super(typeComponent);
    }

    @Override
    protected void drawComponent(String message) {
        System.out.println("Component " + super.getTypeComponent().getTitle() + " draw: " + message);
    }
}
