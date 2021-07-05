package com.kk.question.two;

import java.util.Comparator;

public class FirstnameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        int FirstnameCompare = e1.getFirstName().compareTo(e2.getFirstName());
        int LastnameCompare = e1.getLastName().compareTo(e2.getLastName());
        return (FirstnameCompare == 0) ? LastnameCompare:FirstnameCompare;
    }
}
