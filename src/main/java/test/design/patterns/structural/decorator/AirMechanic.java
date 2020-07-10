package test.design.patterns.structural.decorator;

public class AirMechanic extends EmployeeDecorator{

    public AirMechanic(Employee employee) {
        super(employee);
    }

    public String workOnAirport(){
        return  "worked in the airport... ";
    }

    public String takingBonus(){
        return  " worked for the bonus $150... ";
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
