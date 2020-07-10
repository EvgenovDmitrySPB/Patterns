package test.design.patterns.structural.facade;

import java.math.BigDecimal;

public class Director implements PoliticCompany {
    public Boolean checkCandidate(Candidate candidate) {
        if (candidate.getHaveACar() && candidate.getExperience() > 5 && candidate.getSalary().compareTo(BigDecimal.valueOf(1200)) == -1 ){
            return true;
        }
        return false;
    }
}
