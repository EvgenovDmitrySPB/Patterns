package test.design.patterns.structural.decorator;

public class EmployeeDecorator implements Employee{

    private Employee employee;

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    public String working() {
        return this.employee.working();
    }

    public String getSalary() {
        return this.employee.getSalary();
    }
}
