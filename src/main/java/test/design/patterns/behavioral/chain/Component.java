package test.design.patterns.behavioral.chain;

import lombok.Data;

@Data
public abstract class Component {
    private TypesCo typeComponent;
    private Component nextComponent;

    public Component(TypesCo typeComponent) {
        this.typeComponent = typeComponent;
    }

    public void setNextComponent(Component nextComponent){
        this.nextComponent = nextComponent;
    }

    public void validateComponent(String message, TypesCo typeComponent){
        if (this.typeComponent == typeComponent ){
            drawComponent(message);
        }
        if (nextComponent != null){
            nextComponent.validateComponent(message, typeComponent);
        }
    }

    protected abstract void drawComponent(String message);
}
