package com.kk.question.four;

import java.util.List;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        List<Person>  people = personService.generateList();
        System.out.println("------------------Printing a random list i.e generated in previous step------------------\n");
        personService.show(people);
        System.out.println("\n------------------Transforming the list into a map------------------\n");
        Map<Float, Person> floatPersonMap = personService.transformList(people);
        System.out.println("------------------Printing the Final map------------------\n");
        personService.show(floatPersonMap);
    }
}
