package test.design.patterns.behavioral.command;

public class Create implements Command {
    private Api api;

    public Create(Api api) {
        this.api = api;
    }

    @Override
    public void execute() {
        api.create();
    }
}
