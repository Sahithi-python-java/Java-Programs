package com.sahithi.client;

import com.sahithi.hrentities.*;
import com.sahithi.service.HRService;
import org.joda.time.DateTime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HRService hrService = new HRService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPlease select an option:");
            System.out.println("1 = Add New Employee");
            System.out.println("2 = Remove an Employee");
            System.out.println("3 = Search Employees by Name");
            System.out.println("4 = Search Employee by ID");
            System.out.println("5 = Display All Employees in a Company");
            System.out.println("6 = Exit");

            String userChoice = scanner.nextLine();

            switch (userChoice) {
                case "1":
                    addEmployee(hrService, scanner);
                    break;
                case "2":
                    removeEmployee(hrService, scanner);
                    break;
                case "3":
                    searchEmployeeByName(hrService, scanner);
                    break;
                case "4":
                    searchEmployeeById(hrService, scanner);
                    break;
                case "5":
                    displayEmployees(hrService, scanner);
                    break;
                case "6":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addEmployee(HRService hrService, Scanner scanner) {
        System.out.println("Add a new employee:");

        int companyId = getIntInput(scanner, "Enter Company ID: ");
        int empId = getIntInput(scanner, "Enter Employee ID: ");
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Employment Type (FullTime/Contractor): ");
        String type = scanner.nextLine();

        Employee newEmployee;
        if (type.equalsIgnoreCase("FullTime")) {
            System.out.print("Enter Start Date (yyyy-mm-dd): ");
            DateTime start = DateTime.parse(scanner.nextLine());
            System.out.print("Enter Base Salary Per Year: ");
            float baseSalary = Float.parseFloat(scanner.nextLine());
            System.out.print("Enter Bonus Per Year: ");
            float bonus = Float.parseFloat(scanner.nextLine());
            newEmployee = new FullTime(empId, firstName, lastName, start, baseSalary, bonus);

        } else if (type.equalsIgnoreCase("Contractor")) {
            System.out.print("Enter Start Date (yyyy-mm-dd): ");
            DateTime start = DateTime.parse(scanner.nextLine());
            System.out.print("Enter End Date (yyyy-mm-dd): ");
            DateTime end = DateTime.parse(scanner.nextLine());
            System.out.print("Enter Hourly Rate: ");
            float hourlyRate = Float.parseFloat(scanner.nextLine());
            newEmployee = new Contractor(empId, firstName, lastName, start, end, hourlyRate);

        } else {
            System.out.println("Invalid employment type. Employee not added.");
            return;
        }

        Status status = hrService.addEmployee(companyId, newEmployee);
        if (status == Status.SUCCESS) {
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Failed to add employee.");
        }
    }

    private static void removeEmployee(HRService hrService, Scanner scanner) {
        System.out.println("Remove an employee:");
        int companyId = getIntInput(scanner, "Enter Company ID: ");
        int employeeId = getIntInput(scanner, "Enter Employee ID: ");

        Status status = hrService.removeEmployee(companyId, employeeId);
        if (status == Status.SUCCESS) {
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Error in deleting employee.");
        }
    }

    private static void searchEmployeeByName(HRService hrService, Scanner scanner) {
        System.out.println("Search employees by name:");
        int companyId = getIntInput(scanner, "Enter Company ID: ");
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        var employees = hrService.searchEmployee(companyId, firstName, lastName);
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("Employees found:");
            for (Employee emp : employees) {
                System.out.println("ID: " + emp.getId() + ", Name: " + emp.getFirstName() + " " + emp.getLastName());
            }
        }
    }

    private static void searchEmployeeById(HRService hrService, Scanner scanner) {
        System.out.println("Search employee by ID:");
        int companyId = getIntInput(scanner, "Enter Company ID: ");
        int employeeId = getIntInput(scanner, "Enter Employee ID: ");

        Employee employee = hrService.searchById(companyId, employeeId);
        if (employee != null) {
            System.out.println("Employee found: ID: " + employee.getId() + ", Name: " + employee.getFirstName() + " " + employee.getLastName());
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void displayEmployees(HRService hrService, Scanner scanner) {
        int companyId = getIntInput(scanner, "Enter Company ID to display all employees: ");
        hrService.displayEmployees(companyId);
    }

    private static int getIntInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }
}
