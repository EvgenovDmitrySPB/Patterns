package test.design.patterns.behavioral.state;

import lombok.Data;

@Data
public class MakeDeleteFlag implements State {

    private String name = "makeDeleteFlag";
    private Document document;

    public MakeDeleteFlag(Document document) {
        this.document = document;
    }

    @Override
    public String onCreate() {
        document.setState(new Create(this.document));
        return "Change status on: create";
    }

    @Override
    public String onConducted() {
        document.setState(new Create(this.document));
        document.setState(new Conducted(this.document));
        return "Change status on: conducted";
    }

    @Override
    public String onUnConducted() {
        return "Warning: Not available...";
    }

    @Override
    public String onMakeDeleteFlag() {
        return "Warning: Not available...";
    }
}
