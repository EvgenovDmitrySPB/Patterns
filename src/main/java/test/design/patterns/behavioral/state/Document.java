package test.design.patterns.behavioral.state;

import lombok.Data;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Data
public class Document {

    private String number;
    private State state;
    private Map<String, BigDecimal> records = new HashMap<>();
    private BigDecimal sumResult = BigDecimal.ZERO;

    public Document() {
        this.state = new Create(this);
        number = this.state.onCreate();
        records.put("Document 1", BigDecimal.valueOf(500));
        records.put("Document 2", BigDecimal.valueOf(1200));
        records.put("Document 3", BigDecimal.valueOf(1400));
        records.put("Document 4", BigDecimal.valueOf(700));
        for (BigDecimal value :records.values()) {
            sumResult = sumResult.add(value);
        }
        System.out.println("Created " + this.toString());
    }

    public void create(){
        this.state = new Create(this);
        this.number = state.onCreate();
    }

    public void conducted(){
        this.state.onConducted();
        System.out.println("Conducted " + this.toString());
    }

    public void unConducted(){
        this.state.onUnConducted();
        System.out.println("UnConducted " + this.toString());
    }

    public void makeDeleteFlag(){
        this.state.onMakeDeleteFlag();
        System.out.println("MakeDeleteFlag " + this.toString());
    }

    @Override
    public String toString() {
        return "Document{" +
                "number='" + number + '\'' +
                ", state=" + state.getName() +
                ", sumResult=" + sumResult +
                '}';
    }
}
