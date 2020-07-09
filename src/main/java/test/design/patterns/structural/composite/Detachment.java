package test.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Detachment {
    private List<Soldier> soldiers = new ArrayList<Soldier>();

    void addSoldier(Soldier unit){
        soldiers.add(unit);
    }

    void removeSoldier(Soldier unit){
        soldiers.remove(unit);
    }

    void atack(){
        for (Soldier current:soldiers) {
            current.action();
        }
    }
}
