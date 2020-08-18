package test.design.patterns.behavioral.command;

public class Api {

    public void create(){
        System.out.println("execute create command");
    }

    public void update() {
        System.out.println("execute update command");
    }

    public void findById() {
        System.out.println("execute findById command");
    }

    public void delete() {
        System.out.println("execute delete command");
    }
}
