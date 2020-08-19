package test.design.patterns.behavioral.mediator;

public class Airbus implements Airplane {
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }

    @Override
    public String getMessage() {
        return "I'm going to land";
    }
}
