package test.design.patterns.behavioral.observer;

public class Alfa implements Subscriber{

    @Override
    public void update(String message) {
        System.out.println("AlfaSubscriber got message: "+ message);
    }
}
