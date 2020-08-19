package test.design.patterns.behavioral.mediator;

import java.util.List;

public interface Dispatcher {

    void addPlane(Airplane airplane);
    void sendMessage(String message);
    List<String> getMessage();
}
