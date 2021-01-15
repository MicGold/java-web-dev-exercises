package org.launchcode.java.demos.lsn3classes1;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

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
}
