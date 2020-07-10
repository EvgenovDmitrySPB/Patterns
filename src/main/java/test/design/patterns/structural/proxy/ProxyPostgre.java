package test.design.patterns.structural.proxy;

public class ProxyPostgre implements Database {

    private String url;
    private Database database;
    private final String level = "Proxy...";

    public ProxyPostgre(String url) {
        this.url = url;
    }

    @Override
    public String select() {
        if (database == null) {
            database = new Postgre();
        }
        return level + database.select();
    }

    @Override
    public String update() {
        if (database == null) {
            database = new Oracle();
            database = new Postgre();
        }
        return level + database.update();
    }

    @Override
    public String insert() {
        if (database == null) {
            database = new Postgre();
        }
        return level + database.insert();
    }

    @Override
    public String delete() {
        if (database == null) {
            database = new Postgre();
        }
        return level + database.delete();
    }
}
