package exceptionHandlingAgeProject;

public class RTO {

    public void initiate() throws OverAgedException, UnderAgeException{

        Applicant a = new Applicant();
        a.input();
        a.verify();
    }
}


