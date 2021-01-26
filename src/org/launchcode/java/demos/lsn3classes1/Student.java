package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

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

    public String getGradeLevel() {
        //This method returns the student’s level based on the number of credits they have earned: Freshman (0-29 credits), Sophomore (30-59 credits), Junior (60-89 credits), or Senior (90+ credits).
        if (this.numberOfCredits < 30) {
            return "Freshman";
        }
        if (this.numberOfCredits > 29 && this.numberOfCredits < 60) {
            return "Sophomore";
        }
        if(this.numberOfCredits > 59 && this.numberOfCredits < 90) {
            return "Junior";
        }
        if(this.numberOfCredits > 59 && this.numberOfCredits < 90) {
            return "Junior";
        }else{
            return "Senior";
        }
    }
    public void addGrade(int numCourseCredits, double grade){
        //This method accepts two parameters—a number of course credits and a numerical grade (0.0-4.0). With this data, you need to update the student’s GPA.
       //gpa = (total quality score) / (total number of credits)
        //The quality score for a class is found by multiplying the letter grade score (0.0-4.0) by the number of credits.
        double currentQualityScore = this.gpa*this.numberOfCredits;
        double newQualityScore = currentQualityScore+(grade*numCourseCredits);
        this.numberOfCredits++;
        this.gpa = newQualityScore/this.numberOfCredits;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }
}