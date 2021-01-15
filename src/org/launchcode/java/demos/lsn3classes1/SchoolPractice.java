package org.launchcode.java.demos.lsn3classes1;
import java.util.Scanner;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student michaela = new Student();
        michaela.setName("Michaela");
        michaela.setID(45932541);
        michaela.setCredits(1);
        michaela.setGPA(4.0);

        //create a Teacher
        Teacher mike = new Teacher("Mike", "Kyle", "Criminology", 2);


        //initiate new course
        Course victimology = new Course("Victimology", "CRM", 657, mike);
        victimology.addStudent(michaela);

        //print course
       victimology.getCourseInfo();

    }

}
