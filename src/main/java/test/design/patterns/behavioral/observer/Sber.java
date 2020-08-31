package test.design.patterns.behavioral.observer;

public class Sber implements Subscriber{
    @Override
    public void update(String message) {
        System.out.println("SberSubscriber got message: "+ message);
    }
}
