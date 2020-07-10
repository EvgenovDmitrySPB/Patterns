package test.design.patterns.structural.decorator;

public class Mechanic implements Employee {
    public String working() {
        return "Mechanic is working on his job...";
    }

    public String getSalary() {
        return "Mechanic is getting a salary $500...";
    }
}
