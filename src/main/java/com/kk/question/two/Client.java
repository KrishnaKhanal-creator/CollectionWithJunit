package com.kk.question.two;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3,"Krishna", "Khanal",24));
        employees.add(new Employee(7,"Naresh", "Parsad",28));
        employees.add(new Employee(5,"Gokul", "Khanal",26));
        employees.add(new Employee(2,"Krishna", "Bhai",20));
        Scanner input = new Scanner(System.in);
        List<Employee> sortedList;
        System.out.println("Enter your choice :\n\n 1 - sort by age\n 2 - sort by first name \n 3 - sort by last name");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                Sorting.sortByAge(employees);
                break;
            case 2:
                Sorting.sortByFirstname(employees);
                break;
            case 3:
                Sorting.sortByLastname(employees);
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
