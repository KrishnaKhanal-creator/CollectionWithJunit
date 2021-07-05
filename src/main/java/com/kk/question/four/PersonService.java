package com.kk.question.four;

import java.util.*;

public class PersonService {

    List<Person> generateList(){
        List<Person> listOfPerson = new ArrayList<>();
        listOfPerson.add(new Person(1, "ankur", 20000f));
        listOfPerson.add(new Person(1, "ravi", 30000f));
        listOfPerson.add(new Person(1, "prem", 50000f));
        return listOfPerson;
    }
    Map<Float,Person> transformList(List<Person> people){
        Map<Float,Person> map = new HashMap<>();
        String s = "1.";
        for (int i = 0; i < people.size(); i++) {
            map.put(Float.parseFloat(s),new Person(people.get(i).getId(),people.get(i).getName(),people.get(i).getSalary()));
            for (int j = i+1; j < people.size(); j++) {
                if(people.get(i).getId()==people.get(j).getId()){
                    s = s + 1;
                    map.put(Float.parseFloat(s),new Person(people.get(j).getId(),people.get(j).getName(),people.get(j).getSalary()));
                    i++;
                }
            }
        }
        return map;
    }

    void show(List<Person> people){
        for (Person person: people){
            System.out.println(person);
        }
    }

    void show(Map<Float,Person> people){
        System.out.println("key\t\t\tpersonValue\n");
        Set<Map.Entry<Float, Person>> entrySet = people.entrySet();
        Iterator<Map.Entry<Float, Person>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<Float, Person> nextEntry = iterator.next();
            System.out.println(nextEntry.getKey() + ", " + nextEntry.getValue());
        }
    }
}
