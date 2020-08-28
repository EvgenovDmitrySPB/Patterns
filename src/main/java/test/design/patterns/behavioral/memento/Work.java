package test.design.patterns.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
public class Work {

    private Date dateStart;
    private String nameEmployee;
    private String company;
    private String address;
    private BigDecimal salary;

    public Save save(){
        return new Save(
                dateStart,
                nameEmployee,
                company,
                address,
                salary);
    }

    public void load(Save save){
        this.dateStart = save.getDateStart();
        this.nameEmployee = save.getNameEmployee();
        this.company = save.getCompany();
        this.address = save.getAddress();
        this.salary = save.getSalary();
    }
}
