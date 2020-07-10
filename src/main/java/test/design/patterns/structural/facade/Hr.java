package test.design.patterns.structural.facade;

import java.math.BigDecimal;

public class Hr implements PoliticCompany {
    public Boolean checkCandidate(Candidate candidate) {
        if (candidate.getExperience() > 5 && candidate.getSalary().compareTo(BigDecimal.valueOf(800)) == -1 ){
            return true;
        }
        return false;
    }
}
