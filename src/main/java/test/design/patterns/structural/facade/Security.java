package test.design.patterns.structural.facade;

public class Security implements PoliticCompany {
    public Boolean checkCandidate(Candidate candidate) {
        if (candidate.getWasInPrison()) {
            return false;
        }
        return true;
    }
}
