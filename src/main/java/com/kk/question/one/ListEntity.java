package com.kk.question.one;

import java.util.LinkedList;
import java.util.List;

public class ListEntity {

    private List<Object> objectsList = new LinkedList<>();

    public ListEntity() {
        objectsList.add("One");
        objectsList.add(2);
        objectsList.add("Three");
        objectsList.add(67.986);
        objectsList.add('Z');
        objectsList.add("ABC");
        objectsList.add("123");
        objectsList.add("true");
        objectsList.add("xyz");
        System.out.println("This is a dummy list given in question\n\t\t\t\t\t\t\t\t\t\t\t" + objectsList);
    }

    public List<Object> getObjectsList() {
        return objectsList;
    }
}
