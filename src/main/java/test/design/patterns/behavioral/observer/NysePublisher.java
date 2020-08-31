package test.design.patterns.behavioral.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class NysePublisher implements Publisher {

    private List<Subscriber> subscribersList = new ArrayList<>();
    private List<String> quotes = new ArrayList<>();

    @Override
    public void addQuote(String quote) {
        quotes.add(quote);
        notifySubscriber();
    }

    @Override
    public void clearQuote() {
        quotes.clear();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribersList.add(subscriber);
    }

    @Override
    public void deleteSubscriber(Subscriber subscriber) {
        subscribersList.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        for (Subscriber subs : subscribersList) {
            for (String quote : quotes) {
                subs.update(quote);
            }
        }
        clearQuote();
    }
}
