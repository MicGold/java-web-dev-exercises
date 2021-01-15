package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName(){
        return name;
    }
    protected void setName(String aName){
        this.name = aName;
    }

    public int getID(){
        return studentId;
    }
    protected void setID(int aStudentID){
        this.studentId = aStudentID;
    }

    public int getCredits(){
        return numberOfCredits;
    }
    protected void setCredits(int aNumberOfCredits){
        this.numberOfCredits = aNumberOfCredits;
    }

    public double getGPA(){
        return gpa;
    }
    protected void setGPA(double aGPA){
        this.gpa = aGPA;
    }
}