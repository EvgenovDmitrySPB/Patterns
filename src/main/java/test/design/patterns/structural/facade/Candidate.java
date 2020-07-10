package test.design.patterns.structural.facade;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Candidate {
    private String name;
    private BigDecimal salary;
    private double experience;
    private Boolean haveACar;
    private Boolean wasInPrison;
}
