package test.design.patterns.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@AllArgsConstructor
public class Save {
    private final Date dateStart;
    private final String nameEmployee;
    private final String company;
    private final String address;
    private final BigDecimal salary;
}
