
package student.grading.system;

/**
 *
 * @author Lwandile.Toto
 */
import java.util.ArrayList;

public class Student extends Person {
    private String studentID;
    private ArrayList<Double> grades;

    public Student(String name, int age, String studentID) {
        super(name, age);
        this.studentID = studentID;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    
    @Override
    public void displayInfo() {  // display student info
        super.displayInfo();
        System.out.println("Student ID: " + studentID);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (double grade : grades) sum += grade;
        return sum / grades.size();
    }
}
