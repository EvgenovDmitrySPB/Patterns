package test.design.patterns.behavioral.command;

public class Analizer {
    private Command create;
    private Command update;
    private Command findById;
    private Command delete;

    public Analizer(Command create, Command update, Command findById, Command delete) {
        this.create = create;
        this.update = update;
        this.findById = findById;
        this.delete = delete;
    }

    public void create(){
        create.execute();
    }

    public void update(){
        update.execute();
    }

    public void findById(){
        findById.execute();
    }

    public void delete(){
        delete.execute();
    }
}
