package test.design.patterns.behavioral.chain;

public class TableComponent extends Component {

    public TableComponent(TypesCo typeComponent) {
        super(typeComponent);
    }

    @Override
    protected void drawComponent(String message) {
        System.out.println("Component " + super.getTypeComponent().getTitle() + " draw: " + message);
    }
}
