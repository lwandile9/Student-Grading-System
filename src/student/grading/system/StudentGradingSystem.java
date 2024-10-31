package student.grading.system;

import java.util.Scanner;

/**
 * @author Lwandile.Toto
 */
public class StudentGradingSystem {

  
    public static void main(String[] args) {
              
        
         frmMain frmMain =  new frmMain();
          frmMain.show();
          
        // Getting the user inputs in the console 
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter instructor name:- ");
            String instructorsName = scanner.nextLine();
            System.out.print("Enter instructors age:- ");
            int instructorsAge = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter instructors id:- ");
            String instructorsID = scanner.nextLine();
            Instructor instructor = new Instructor(instructorsName, instructorsAge, instructorsID);
            
            System.out.print("Enter course name:- ");
            String courseName = scanner.nextLine();
            Course course = new Course(courseName, instructor);
            
            System.out.print("Enter number of students to enroll:- ");
            int numStudents = scanner.nextInt();
            scanner.nextLine();
            
            
            // loop throug given number of students to generate  each student record  
            for (int i = 0; i < numStudents; i++) {
                System.out.print("Enter students name:- ");
                String studentName = scanner.nextLine();
                System.out.print("Enter students age:- ");
                int studentAge = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter students Id:- ");
                String studentID = scanner.nextLine();
                
                Student student = new Student(studentName, studentAge, studentID);
                course.addStudent(student);
                
                System.out.print("Enter number of grades for the above student:- ");
                int numGrades = scanner.nextInt();
                for (int index = 0; index < numGrades; index++) {
                    System.out.print("Enter grade:- ");
                    double grade = scanner.nextDouble();
                    student.addGrade(grade);
                }
                scanner.nextLine();
            }
           
            
             // this will display full   information ( course , instructor , enralled students with their details)
            course.displayCourseInfo();
        }
    }
}
