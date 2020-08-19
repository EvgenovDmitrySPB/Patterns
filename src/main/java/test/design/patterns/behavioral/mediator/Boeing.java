package test.design.patterns.behavioral.mediator;

public class Boeing implements Airplane{

    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }

    @Override
    public String getMessage() {
        return "Take off";
    }
}
