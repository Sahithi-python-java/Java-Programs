package com.sahithi.hrentities;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private int id;
    private String name;
    private List<Employee> employees;

    public Company(int id, String name, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.employees = employees != null ? employees : new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
