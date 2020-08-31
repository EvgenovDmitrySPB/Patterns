package test.design.patterns.behavioral.observer;

public interface Publisher {

    void addQuote(String message);
    void clearQuote();

    void addSubscriber(Subscriber subscriber);
    void deleteSubscriber(Subscriber subscriber);
    void notifySubscriber();
}
