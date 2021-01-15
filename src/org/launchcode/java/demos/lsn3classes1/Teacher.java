package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String first, String last, String subj, int years){
        this.firstName = first;
        this.lastName = last;
        this.subject = subj;
        this.yearsTeaching = years;
    }

    public String getName(){
        return firstName + " " + lastName;
    }
    protected void setName(String aFirstName, String aLastName){
        this.firstName = aFirstName;
        this.lastName = aLastName;
    }

    public String getSubject(){
        return subject;
    }
    protected void setSubject(String aSubject){
        this.subject = aSubject;
    }

    public int getYearsTeaching(){
        return yearsTeaching;
    }
    protected void setCredits(int aNumberOfYears){
        this.yearsTeaching = aNumberOfYears;
    }
}
