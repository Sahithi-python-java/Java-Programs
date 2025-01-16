package com.hrsystem.main;

import com.hrsystem.services.HRService;
import com.hrsystem.utils.Status;

import java.util.Scanner;

public class HRSystemApp {
    public static void main(String[] args) {
        HRService hrService = new HRService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- HR System Menu ---");
            System.out.println("1. Register Company");
            System.out.println("2. Add Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Search Employee");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> hrService.registerCompany(scanner);
                case 2 -> hrService.addEmployee(scanner);
                case 3 -> {
                    System.out.print("Enter Company ID: ");
                    String companyId = scanner.next();
                    System.out.print("Enter Employee ID: ");
                    int employeeId = scanner.nextInt();
                    Status removeStatus = hrService.removeEmployee(companyId, employeeId);
                    System.out.println("Remove Employee Status: " + removeStatus);
                }
                case 4 -> {
                    System.out.print("Enter Company ID: ");
                    String companyId = scanner.next();
                    System.out.print("Enter Employee First Name: ");
                    String firstName = scanner.next();
                    System.out.print("Enter Employee Last Name: ");
                    String lastName = scanner.next();
                    hrService.searchEmployee(companyId, firstName, lastName);
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
