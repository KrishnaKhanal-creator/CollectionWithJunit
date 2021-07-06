package com.kk.question.two;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Company company = new Company();
        Scanner input = new Scanner(System.in);
        List<Employee> sortedList;
        System.out.println("Enter your choice :\n\n 1 - sort by age\n 2 - sort by first name \n 3 - sort by last name");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                Sorting.sortByAge(company.getEmployees());
                break;
            case 2:
                Sorting.sortByFirstname(company.getEmployees());
                break;
            case 3:
                Sorting.sortByLastname(company.getEmployees());
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
