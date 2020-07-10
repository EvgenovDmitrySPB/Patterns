package test.design.patterns.structural.decorator;

public class AutoMechanic extends EmployeeDecorator{

    public AutoMechanic(Employee employee) {
        super(employee);
    }

    public String workOnAirport(){
        return  "worked in autosalon... ";
    }

    public String takingBonus(){
        return  " took the bonus $50... ";
    }

    @Override
    public String working() {
        return super.working() + workOnAirport();
    }

    @Override
    public String getSalary() {
        return super.getSalary() + takingBonus();
    }
}
