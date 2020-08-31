package test.design.patterns.behavioral.state;

import lombok.Data;

@Data
public class UnConducted implements State {

    private String name = "unConducted";
    private Document document;

    public UnConducted(Document document) {
        this.document = document;
    }

    @Override
    public String onCreate() {
        return "Warning: Not available...";
    }

    @Override
    public String onConducted() {
        document.setState(new Conducted(this.document));
        return "Change status on: conducted";
    }

    @Override
    public String onUnConducted() {
        return "Warning: Not available...";
    }

    @Override
    public String onMakeDeleteFlag() {
        document.setState(new MakeDeleteFlag(this.document));
        return "Change status on: makeDeleteFlag";
    }
}
