package test.design.patterns.behavioral.state;

import lombok.Data;

@Data
public class Conducted implements State {

    private String name = "conducted";
    private Document document;

    public Conducted(Document document) {
        this.document = document;
    }

    @Override
    public String onCreate() {
        return "Warning: Not available...";
    }

    @Override
    public String onConducted() {
        return "Warning: Not available...";
    }

    @Override
    public String onUnConducted() {
        document.setState(new UnConducted(this.document));
        return "Change status on: unConducted";
    }

    @Override
    public String onMakeDeleteFlag() {
        document.setState(new UnConducted(this.document));
        document.setState(new MakeDeleteFlag(this.document));
        return "Change status on: makeDeleteFlag";
    }
}
