// Defining the Student class
public class Student {
    // Attributes (instance variables)
    String name;
    int rollNumber;
    double grade;

    // Constructor for the Student class
    public Student(String studentName, int studentRollNumber, double studentGrade) {
        // Initializing the instance variables
        name = studentName;
        rollNumber = studentRollNumber;
        grade = studentGrade;
    }

    // Method (function) to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    // Main method to create an object and use the Student class
    public static void main(String[] args) {
        // Creating an object of the Student class using the constructor
        Student student1 = new Student("Sahithi Janga", 101, 8.5);

        // Calling the displayDetails method on the object to show the student's information
        student1.displayDetails();
    }
}
