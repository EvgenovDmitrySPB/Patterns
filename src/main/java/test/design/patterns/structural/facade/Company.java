package test.design.patterns.structural.facade;

public class Company {

    private Hr hr;
    private Director director;
    private Security security;

    public Company(Hr hr, Director director, Security security) {
        this.hr = hr;
        this.director = director;
        this.security = security;
    }

    Boolean getJob(Candidate candidate){
        Boolean result;

        if (hr.checkCandidate(candidate) && director.checkCandidate(candidate) && security.checkCandidate(candidate)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
