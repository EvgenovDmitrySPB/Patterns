package test.design.patterns.behavioral.observer;

public class Fin implements Subscriber{

    @Override
    public void update(String message) {
        System.out.println("FinSubscriber got message: "+ message);
    }
}
