package test.design.patterns.structural.proxy;

public class Postgre implements Database{
    @Override
    public String select() {
        return "Postgre making the operation selecting...";
    }

    @Override
    public String update() {
        return "Postgre making the operation updating...";
    }

    @Override
    public String insert() {
        return "Postgre making the operation inserting...";
    }

    @Override
    public String delete() {
        return "Postgre making the operation deleting...";
    }
}
