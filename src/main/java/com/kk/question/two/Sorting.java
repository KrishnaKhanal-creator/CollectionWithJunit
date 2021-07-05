package com.kk.question.two;

import java.util.Collections;
import java.util.List;

public class Sorting {

    public static void sortByAge(List<Employee> employees){
        Collections.sort(employees,new AgeComparator());
        for (Employee emp:employees) {
            System.out.println(emp);
        }
    }
    public static void sortByFirstname(List<Employee> employees){
        Collections.sort(employees,new FirstnameComparator());
        for (Employee emp:employees) {
            System.out.println(emp);
        }
    }
    public static void sortByLastname(List<Employee> employees){
        Collections.sort(employees,new LastnameComparator());
        for (Employee emp:employees) {
            System.out.println(emp);
        }
    }
}
