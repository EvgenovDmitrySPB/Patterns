package test.design.patterns.behavioral.mediator;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class AirportDispatcher implements Dispatcher, Constants {

    private List<Airplane> airplane = new ArrayList<>();

    @Override
    public void addPlane(Airplane airplane) {
        this.airplane.add(airplane);
    }

    @Override
    public void sendMessage(String message) {
        for (Airplane plane : airplane) {
            if (plane instanceof Airbus) {
                plane.sendMessage(AIRBUS + " got : " + message);
            } else if (plane instanceof Boeing) {
                plane.sendMessage(BOEING + " got : "+ message);
            } else if (plane instanceof TU) {
                plane.sendMessage(TU + " got : " + message);
            }
        }
    }

    @Override
    public List<String> getMessage() {
        List<String> list = new ArrayList<>();

        for (Airplane plane : airplane) {
            if (plane instanceof Airbus) {
                list.add(AIRBUS + ": " + plane.getMessage());
            } else if (plane instanceof Boeing) {
                list.add(BOEING + ": " + plane.getMessage());
            } else if (plane instanceof TU) {
                list.add(TU + ": " + plane.getMessage());
            }
        }

        return list;
    }
}
