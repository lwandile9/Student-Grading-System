
package student.grading.system;

import java.util.ArrayList;

/**
 * @author Lwandile.Toto
 */

public class Course {
    private String courseName;
    private Instructor instructor;
    private ArrayList<Student> students;

    public Course(String courseName, Instructor instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayCourseInfo() {
        System.out.println(" ");
        System.out.println("Course: " + courseName);
        instructor.displayInfo();
        System.out.println("Enrolled Students: ");
        for (Student student : students) {
            student.displayInfo();
            System.out.println("Average Grade: " + student.calculateAverage());
        }
    }
               
}

    

