package test.design.patterns.structural.proxy;

public class Oracle implements Database{
    @Override
    public String select() {
        return "Oracle making the operation selecting..."; 
    }

    @Override
    public String update() {
        return "Oracle making the operation updating..."; 
    }

    @Override
    public String insert() {
        return "Oracle making the operation inserting..."; 
    }

    @Override
    public String delete() {
        return "Oracle making the operation deleting..."; 
    }
}
