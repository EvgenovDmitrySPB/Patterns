package test.design.patterns.behavioral.command;

public class Update implements Command {
    private Api api;

    public Update(Api api) {
        this.api = api;
    }

    @Override
    public void execute() {
        api.update();
    }
}
