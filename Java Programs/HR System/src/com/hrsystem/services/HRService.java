package com.hrsystem.services;

import com.hrsystem.models.Company;
import com.hrsystem.models.Employee;
import com.hrsystem.utils.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HRService {
    private List<Company> companies = new ArrayList<>();

    // Register a new company
    public Status registerCompany(Scanner scanner) {
        System.out.print("Enter Company ID: ");
        String companyId = scanner.next();
        System.out.print("Enter Company Name: ");
        String companyName = scanner.next();

        // Check if the company already exists
        if (companies.stream().anyMatch(c -> c.getId().equals(companyId))) {
            System.out.println("Company already exists.");
            return Status.FAILURE;
        }

        // Register the new company
        Company company = new Company(companyId, companyName);
        companies.add(company);
        System.out.println("Company registered successfully!");
        return Status.SUCCESS;
    }

    // Add an employee to a company
    public Status addEmployee(Scanner scanner) {
        System.out.print("Enter Company ID: ");
        String companyId = scanner.next();
        Company company = companies.stream()
                .filter(c -> c.getId().equals(companyId))
                .findFirst()
                .orElse(null);

        if (company == null) {
            System.out.println("Company not found.");
            return Status.FAILURE;
        }

        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();
        System.out.print("Enter First Name: ");
        String firstName = scanner.next();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.next();

        // Create and add the employee
        Employee employee = new Employee(employeeId, firstName, lastName);
        company.addEmployee(employee);
        System.out.println("Employee added successfully!");
        return Status.SUCCESS;
    }

    // Remove an employee from a company
    public Status removeEmployee(String companyId, int employeeId) {
        Company company = companies.stream()
                .filter(c -> c.getId().equals(companyId))
                .findFirst()
                .orElse(null);

        if (company == null) return Status.FAILURE;

        boolean removed = company.removeEmployee(employeeId);
        return removed ? Status.SUCCESS : Status.FAILURE;
    }

    // Search for an employee in a company
    public void searchEmployee(String companyId, String firstName, String lastName) {
        Company company = companies.stream()
                .filter(c -> c.getId().equals(companyId))
                .findFirst()
                .orElse(null);

        if (company != null) {
            List<Employee> foundEmployees = company.getEmployees().stream()
                    .filter(e -> e.getFirstName().equalsIgnoreCase(firstName) && e.getLastName().equalsIgnoreCase(lastName))
                    .toList();
            System.out.println("Search Results:");
            foundEmployees.forEach(System.out::println);
        } else {
            System.out.println("Company not found.");
        }
    }
}
