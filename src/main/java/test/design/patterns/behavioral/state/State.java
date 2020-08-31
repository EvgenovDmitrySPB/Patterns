package test.design.patterns.behavioral.state;

public interface State {
    String getName();
    String onCreate();
    String onConducted();
    String onUnConducted();
    String onMakeDeleteFlag();
}
