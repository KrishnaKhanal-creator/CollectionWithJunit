package com.kk.question.two;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {
    List<Employee> employees;
    Company company;

    @BeforeEach
    void init(){
        employees = new ArrayList<>();
        employees.add(new Employee(1,"Aliem","Ballare", 24));
        employees.add(new Employee(1,"Zuber","Dahal", 23));
        employees.add(new Employee(1,"Sham","Madi", 25));
        employees.add(new Employee(1,"Sham","Dahal", 25));
        company = new Company();
    }

    @Test
    void testSortByAge() {

        assertTrue(Sorting.sortByAge(employees));
    }

    @Test
    void getEmployees() {
        assertEquals(24,company.getEmployees().get(0).getAge());
    }

    @Test
    void testSortByFirstname() {
        assertTrue(Sorting.sortByFirstname(employees));
    }

    @Test
    void testSortByLastname() {
        assertTrue(Sorting.sortByLastname(employees));
    }

    @AfterEach
    void close(){
        System.out.println("-----------------");
    }
}