/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.grading.system;

/**
 *
 * @author Lwandile.Toto
 */
public class Instructor extends Person {
    private String instructorID;

    public Instructor(String name, int age, String instructorID) {
        super(name, age);
        this.instructorID = instructorID;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Instructor ID: " + instructorID);
    }
}

