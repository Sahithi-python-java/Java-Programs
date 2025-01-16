package com.sahithi.service;

import com.sahithi.hrentities.*;
import java.util.*;

public class HRService {
    private Map<Integer, Company> db;

    public HRService() {
        db = new HashMap<>();
        db.put(1, new Company(1, "IBM", dummyEmployees()));
        db.put(2, new Company(2, "Microsoft", dummyEmployees()));
    }

    private List<Employee> dummyEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Ravi", "Kapoor"));
        employees.add(new Employee(2, "Donald", "Trump"));
        return employees;
    }

    public Status addEmployee(int companyId, Employee newEmployee) {
        Company company = db.get(companyId);
        if (company != null) {
            company.addEmployee(newEmployee);
            return Status.SUCCESS;
        }
        System.out.println("Company with ID " + companyId + " not found.");
        return Status.FAILURE;
    }

    public Status removeEmployee(int companyId, int employeeId) {
        Company company = db.get(companyId);
        if (company != null) {
            List<Employee> employees = company.getEmployees();
            for (Employee emp : employees) {
                if (emp.getId() == employeeId) {
                    employees.remove(emp);
                    return Status.SUCCESS;
                }
            }
        }
        return Status.FAILURE;
    }

    public List<Employee> searchEmployee(int companyId, String firstName, String lastName) {
        List<Employee> result = new ArrayList<>();
        Company company = db.get(companyId);
        if (company != null) {
            for (Employee emp : company.getEmployees()) {
                if (emp.getFirstName().equalsIgnoreCase(firstName) &&
                        emp.getLastName().equalsIgnoreCase(lastName)) {
                    result.add(emp);
                }
            }
        }
        return result;
    }

    public Employee searchById(int companyId, int employeeId) {
        Company company = db.get(companyId);
        if (company != null) {
            for (Employee emp : company.getEmployees()) {
                if (emp.getId() == employeeId) {
                    return emp;
                }
            }
        }
        return null;
    }

    public void displayEmployees(int companyId) {
        Company company = db.get(companyId);
        if (company != null) {
            for (Employee emp : company.getEmployees()) {
                System.out.println("Employee ID: " + emp.getId() + ", Name: " + emp.getFirstName() + " " + emp.getLastName());
            }
        } else {
            System.out.println("Company not found.");
        }
    }
}
