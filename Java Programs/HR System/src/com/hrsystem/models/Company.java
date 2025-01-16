package com.hrsystem.models;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String id;
    private String name;
    private List<Employee> employees;

    public Company(String id, String name) {
        this.id = id;
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public boolean removeEmployee(int employeeId) {
        return employees.removeIf(employee -> employee.getId() == employeeId);
    }
}
