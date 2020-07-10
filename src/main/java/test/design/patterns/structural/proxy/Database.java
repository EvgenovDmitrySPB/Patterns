package test.design.patterns.structural.proxy;

public interface Database {
    String select();
    String update();
    String insert();
    String delete();
}
