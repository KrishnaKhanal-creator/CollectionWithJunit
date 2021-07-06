package com.kk.question.two;

import java.util.Collections;
import java.util.List;

public class Sorting {

    public static boolean sortByAge(List<Employee> employees){
        Collections.sort(employees,new AgeComparator());
        for (Employee emp:employees) {
            System.out.println(emp);
        }
        return true;
    }
    public static boolean sortByFirstname(List<Employee> employees){
        Collections.sort(employees,new FirstnameComparator());
        for (Employee emp:employees) {
            System.out.println(emp);
        }
        return true;
    }
    public static boolean sortByLastname(List<Employee> employees){
        Collections.sort(employees,new LastnameComparator());
        for (Employee emp:employees) {
            System.out.println(emp);
        }
        return true;
    }
}
