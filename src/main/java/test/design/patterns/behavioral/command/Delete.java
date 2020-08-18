package test.design.patterns.behavioral.command;

public class Delete implements Command {
    private Api api;

    public Delete(Api api) {
        this.api = api;
    }

    @Override
    public void execute() {
        api.delete();
    }
}
