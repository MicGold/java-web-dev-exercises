package org.launchcode.java.demos.lsn3classes1;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Course {
    private String name;
    private String courseCode;
    private int courseID;
    private Teacher teacher;
    private HashMap<String, Integer> roster = new HashMap<>();

    public Course(String courseName, String code, int id, Teacher teach){
        this.name = courseName;
        this.courseCode = code;
        this.courseID = id;
        this.teacher = teach;
    }

    public String getName(){
        return name;
    }
    protected void setName(String aName){
        this.name = aName;
    }

    public String getCourseCode(){
        return courseCode;
    }
    protected void setCourseCode(String aCourseCode){
        this.courseCode = aCourseCode;
    }

    public int getCourseID(){
        return courseID;
    }
    protected void setID(int aCourseID){
        this.courseID = aCourseID;
    }

    public void addStudent(Student newStudent){
        String studentName = newStudent.getName();
        int studentID = newStudent.getID();
        this.roster.put(studentName, studentID);
    }

    public HashMap<String, Integer> getRoster(){
        return roster;
    }

    public void getCourseInfo(){
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code and ID: " + this.courseCode + this.courseID);
        System.out.println("Taught by: " + teacher.getName());
        System.out.println("Enrolled Students: " + this.roster.keySet());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return getCourseID() == course.getCourseID() && getName().equals(course.getName()) && getCourseCode().equals(course.getCourseCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCourseCode(), getCourseID());
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", courseID=" + courseID +
                ", teacher=" + teacher +
                '}';
    }
}
