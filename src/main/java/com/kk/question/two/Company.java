package com.kk.question.two;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employees = new ArrayList<>();

    public Company() {
        employees.add(new Employee(3,"Krishna", "Khanal",24));
        employees.add(new Employee(7,"Naresh", "Parsad",28));
        employees.add(new Employee(5,"Gokul", "Khanal",26));
        employees.add(new Employee(2,"Krishna", "Bhai",20));
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
