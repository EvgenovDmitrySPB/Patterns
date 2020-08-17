package test.design.patterns.behavioral.chain;

public enum TypesCo {

    LAYER("layer"),
    PANEL("panel"),
    TABLE("table"),
    BUTTON("button"),
    CHECKBOX("checkBox");

    private String title;

    TypesCo(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "TypeComponent{" +
                "title='" + title + '\'' +
                '}';
    }
}
