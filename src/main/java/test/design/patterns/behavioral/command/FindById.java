package test.design.patterns.behavioral.command;

public class FindById implements Command {
    private Api api;

    public FindById(Api api) {
        this.api = api;
    }

    @Override
    public void execute() {
        api.findById();
    }
}
