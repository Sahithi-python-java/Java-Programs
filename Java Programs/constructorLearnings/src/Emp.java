public class Emp {
    String name;
    int id;
    //Constructor for Emp class
    public Emp(String empName, int empId) {
        name = empName;
        id = empId;
    }

    public static void main(String[] args) {
        //Creating an object of the Emp class inside the main method
        Emp emp1 = new Emp("Sahithi Janga", 12345);
        // Printing out the employee details to verify
        System.out.println("Employee Name: " + emp1.name);
        System.out.println("Employee ID: " + emp1.id);
    }
}