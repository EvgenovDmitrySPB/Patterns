package test.design.patterns.structural.proxy;

public class ProxyOracle implements Database {

    private String url;
    private Database database;
    private final String level = "Proxy...";

    public ProxyOracle(String url) {
        this.url = url;
    }

    @Override
    public String select() {
        if (database == null) {
            database = new Oracle();
        }
        return level + database.select();
    }

    @Override
    public String update() {
        if (database == null) {
            database = new Oracle();
        }
        return level + database.update();
    }

    @Override
    public String insert() {
        if (database == null) {
            database = new Oracle();
        }
        return level + database.insert();
    }

    @Override
    public String delete() {
        if (database == null) {
            database = new Oracle();
        }
        return level + database.delete();
    }
}
