package test.design.patterns.behavioral.mediator;

public class TU implements Airplane {
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }

    @Override
    public String getMessage() {
        return "Going to sit down";
    }
}
